package com.epam.anya.servlet.util;

import com.epam.anya.servlet.entity.Text;

public class Parser {

    public static Text parseText(String submittedText) {
        String textStr = clean(submittedText);
        Text text = new Text(textStr);
        return text;
    }

    public static String clean(String textStr) {
        textStr = textStr.replaceAll("<|>|\\t|\\s+", " ");
        return textStr;
    }
}
