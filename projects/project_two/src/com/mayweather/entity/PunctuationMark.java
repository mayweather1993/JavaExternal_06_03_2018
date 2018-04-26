package com.mayweather.entity;

/**
 * Class represents an entity like punctuation mark
 */
class PunctuationMark extends Symbol implements SentenceInterface {
    /**
     * For checking place of the symbol
     */
    private boolean end;

    /**
     * Creating a punctuation object by the given symbol
     *
     * @param symbol punctuation mark
     */
    private PunctuationMark(char symbol) {
        super(symbol);
        if (symbol == '.' || symbol == '?' || symbol == '!') {
            end = true;
        }
    }

    /**
     * Checking if punctuation mark is represents the end of a sentence
     *
     * @return true if end,else not
     */
    boolean isEnd() {
        return end;
    }


    /**
     * Checking if a given symbol is a punctuation mark
     *
     * @param symbol to be checked
     * @return symbol
     */
    private static boolean isPunctuationMark(char symbol) {
        return (symbol < 'a' || symbol > 'z') && (symbol < 'A' || symbol > 'Z') &&
                symbol != '\'';
    }

    /**
     * Creating punctuation mark
     *
     * @param symbol of punctuation mark
     * @return new object or null
     */
    static PunctuationMark create(char symbol) {
        if (!isPunctuationMark(symbol)) {
            return new PunctuationMark(symbol);
        } else return null;
    }

}
