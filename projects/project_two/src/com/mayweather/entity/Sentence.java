package com.mayweather.entity;

import java.util.*;

public class Sentence implements Iterable<SentenceInterface> {
    private List<SentenceInterface> tokens; // words and punctuation marks

    public Sentence() {
        tokens = new ArrayList<>();
    }

    /**
     * Adds new token to the sentence (to the list of tokens).
     *
     * @param token the element to be added to the sentence
     */
    private void addToken(SentenceInterface token) {
        tokens.add(token);
    }

    /**
     * Reads the sentence tokens from Scanner.
     *
     * @param scanner the source of input data
     */
    public void read(Scanner scanner) {
        String temp;
        int wordLength;
        boolean endOfSentence = false;
        Stack<PunctuationMark> marks = new Stack<>();

        do {

            /* Read the sentence string-by-string until we meet the punctuation
             * mark which represents the end of a sentence or the last string
             * was processed.
             */
            if (scanner.hasNext()) {
                temp = scanner.next();

                // check the last symbol
                wordLength = temp.length();

                // try to create a punctuation mark
                marks.push(PunctuationMark.create((temp.charAt(wordLength - 1))));
                if (marks.peek() == null) {

                    // the last symbol is not a punctuation mark
                    marks.pop();

                    // create new word from temp and add it to the list
                    addToken(new Word(temp));
                } else {

                    // mark - punctuation mark
                    --wordLength;

                    if (marks.peek().isEnd()) {
                        endOfSentence = true;
                    }

                    // read all punctuation marks to get pure text
                    for (int i = wordLength - 1; i >= 0; --i) {
                        marks.push(PunctuationMark.create(temp.charAt(i)));
                        if (marks.peek() == null) {

                            // it is not a punctuation mark
                            marks.pop();
                            break;
                        } else {

                            // punctuation mark, cut the word
                            --wordLength;
                        }
                    }

                    // finally add the word to the list
                    if (wordLength > 0) {
                        addToken(new Word(temp.substring(0, wordLength)));
                    }

                    // add all punctuation marks to the list
                    while (!marks.empty()) {
                        addToken(marks.pop());
                    }
                }
            } else {
                endOfSentence = true;
            }
        }
        while (!endOfSentence);
    }

    @Override
    public Iterator<SentenceInterface> iterator() {
        return tokens.iterator();
    }
}
