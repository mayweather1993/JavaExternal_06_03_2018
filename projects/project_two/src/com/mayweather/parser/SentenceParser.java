package com.mayweather.parser;


import com.mayweather.entity.Sentence;
import com.mayweather.entity.SentenceInterface;
import com.mayweather.entity.Vocabulary;
import com.mayweather.entity.Word;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SentenceParser {
    private Vocabulary vocabulary; // holds distinct words in lexicographical order
    private List<Sentence> text; // list of sentences

    private SentenceParser() {
        vocabulary = new Vocabulary();
        text = new ArrayList<>();
    }

    /**
     * Reads the text sentence-by-sentence from scanner.
     *
     * @param scanner the source of input data
     */
    private void parse(Scanner scanner) {
        Sentence temp;

        // read all sentences
        while (scanner.hasNext()) {
            temp = new Sentence();
            temp.read(scanner);
            text.add(temp);
        }
    }

    /**
     * Generates vocabulary from the given list of sentences.
     *
     * @return the vocabulary created from the sentences
     */
    private Vocabulary createVocabulary() {
        for (Sentence s : text) {

            // loop through all sentences
            for (SentenceInterface token : s) {

                // loop through all tokens in the sentence
                if (token instanceof Word) {

                    // add word to vocabulary
                    vocabulary.addWord((Word) token);
                }
            }
        }

        return vocabulary;
    }

    /**
     * Creates parser which reads a text from the file to the list of sentences,
     * creates vocabulary and prints its content to html file.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        SentenceParser parser = new SentenceParser();

        try {
            parser.parse(new Scanner(new File("input.txt")));
        } catch (FileNotFoundException e) {
            System.out.println("Cannot open the file input.txt");
        }

        parser.createVocabulary().printToHTML("output.htm");
        System.out.println("Check the output in output.htm");
    }
}
