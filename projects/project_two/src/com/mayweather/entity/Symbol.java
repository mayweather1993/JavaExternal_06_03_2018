package com.mayweather.entity;

/**
 * Abstract class to manipulate symbols
 */

public abstract class Symbol {


    private char symbol;

    /**
     * Creating a symbol
     *
     * @param symbol
     */
    public Symbol(char symbol) {
        this.symbol = symbol;
    }

    /**
     * Returning a symbol
     *
     * @return character of Symbol
     */
    public char getSymbol() {
        return symbol;
    }
}
