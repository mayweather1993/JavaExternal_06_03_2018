package com.mayweather;

import com.mayweather.controller.ParsController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Runner {
    public static void main(String[] args) throws IOException {
        String path = "http://www.stihi-rus.ru/World/Shekspir/";
        Map<Integer, List<String>> map = new TreeMap<>();
        ParsController controller = new ParsController();
        String response = ParsController.read(path);
        List<String> pths = controller.getPath(path, response, 20);
        for (String p : pths) {
            String pResponse = ParsController.read(p);
            String[] words = controller.getWords(pResponse);
            int number = controller.count(words, "Шекспир");
            if (map.containsKey(number)) {
                map.get(number).add(p);
            } else {
                List<String> l = new ArrayList<>();
                l.add(p);
                map.put(number, l);
            }
            String word = controller.find(words);
            String[] strings = word.split(":");
            controller.insert(strings[0], Integer.valueOf(strings[1]), p);
        }
        System.out.println(map.toString());
        System.out.println(controller.getParser().toString());
    }
}

