package com.epam.anya.servlet.entity;

public class Symbol {
    private final char symbol;

    public Symbol(char character) {
        this.symbol = character;
    }

    public Symbol() {

        symbol = 0;
    }

    public char getCharacter() {
        return symbol;
    }

    @Override
    public String toString() {
        return symbol + "";
    }
}
