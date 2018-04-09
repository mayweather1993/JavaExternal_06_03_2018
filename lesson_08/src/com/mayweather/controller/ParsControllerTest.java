package com.mayweather.controller;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.List;

import static java.util.Optional.of;
import static org.junit.Assert.assertEquals;

@RunWith(PowerMockRunner.class)
@PrepareForTest(ParsController.class)
public class ParsControllerTest {

    private ParsController parsController;
    private String path;

    @Before
    public void setUp() throws Exception {
        String data = "Мы урожая ждем от лучших лоз,\n" +
                "Чтоб красота жила, не увядая.\n" +
                "Пусть вянут лепестки созревших роз,\n" +
                "Хранит их память роза молодая.\n" +
                "\n" +
                "А ты, в свою влюбленный красоту,\n" +
                "Все лучшие ей отдавая соки,\n" +
                "Обилье превращаешь в нищету, -\n" +
                "Свой злейший враг, бездушный и жестокий.\n" +
                "\n" +
                "Ты - украшенье нынешнего дня,\n" +
                "Недолговременной весны глашатай, -\n" +
                "Грядущее в зачатке хороня,\n" +
                "Соединяешь скаредность с растратой.\n" +
                "\n" +
                "Жалея мир, земле не предавай\n" +
                "Грядущих лет прекрасный урожай!";
        PowerMockito.mockStatic(ParsController.class);
        path = "http://www.stihi-rus.ru/World/Shekspir/";
        PowerMockito.when(ParsController.read(path)).thenReturn(data);
        parsController = new ParsController();
    }

    @Test
    public void countWords() {
        int expectedNumber = 3;
        String[] values = {"java", "sharp", "sharp", "sharp"};
        int count = parsController.count(values, "sharp");
        assertEquals(expectedNumber, count);
    }


    @Test
    public void getIncludePathes() throws Exception {
        int size = 0;
        int pathes = 20;
        String response = ParsController.read(path);
        List<String> paths = parsController.getPath(path, response, pathes);
        assertEquals(size, paths.size());
    }

    @Test
    public void getWords() throws Exception {
        int numberOfWords = 68;
        String response = ParsController.read(path);
        String[] words = parsController.getWords(response);
        int wordNumber = words.length;
        assertEquals(numberOfWords, wordNumber);
    }


    @Test
    public void getParser() throws Exception {
        int sizeOfHashMap = 1;
        String response = ParsController.read(path);
        String[] words = parsController.getWords(response);
        String wordWithCounter = parsController.find(words);
        String[] split = wordWithCounter.split(":");
        parsController.insert(split[0], Integer.valueOf(split[1]), path);
        assertEquals(sizeOfHashMap, parsController.getParser().size());
    }

    @Test
    public void findWord() throws Exception {
        String expectedWord = "урожая";
        int number = 1;
        String response = ParsController.read(path);
        String[] words = parsController.getWords(response);
        String wordWithCounter = parsController.find(words);
        String word = wordWithCounter.split(":")[0];
        Integer counter = Integer.valueOf(wordWithCounter.split(":")[1]);
        assertEquals(of(number), of(counter));
        assertEquals(expectedWord, word);
    }

}