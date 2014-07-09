package com.epam.anya.servlet.entity;

public class Text extends Symbol {
    public Paragraph[] parts;

    public Text(String content) {
        super(content);
    }
}
