package com.epam.anya.servlet.parser;

import com.epam.anya.servlet.entity.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {
    public static Text parseText(String inputText) {
        Text text = new Text(inputText);
        return text;

    }
}
