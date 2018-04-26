package com.mayweather.entity;

/**
 * Class representing a word with comparing method
 */
public class Word implements SentenceInterface, Comparable<Word> {

    private String word;

    public Word(String word) {
        this.word = word;
    }

    String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    @Override
    public int compareTo(Word comparingWord) {
        return word.compareToIgnoreCase(comparingWord.getWord());
    }
}
