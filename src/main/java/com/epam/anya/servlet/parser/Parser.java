package com.epam.anya.servlet.parser;

import com.epam.anya.servlet.entity.Paragraph;
import com.epam.anya.servlet.entity.Sentence;
import com.epam.anya.servlet.entity.Text;
import com.epam.anya.servlet.entity.Word;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {

    public void parseText(String textSourceString){
        Text text = new Text();
        String [] parSourceStrings = textSourceString.split("dfghjkljhjgfhjklkb jhg");
        parseParagraph(parSourceStrings);
        for (String parSourceStrings : parSourceStrings){
           Paragraph paragraph = parseParagraph(parSourceStrings);
            text.add(Paragraph);
        }
    }

    private Paragraph parseParagraph(String[] parSourceStrings) {
        Paragraph paragraph= new Paragraph();

        return null;
    }

    public static final String TEXT = "input.txt";
    private static final String GROUP_WORD = "word";
    private static final String GROUP_PUNCTUATION = "punctuation";
    private static final String GROUP_PARAGRAPH = "paragraph";
    private static final Pattern PATTERN_WORD =
            Pattern.compile("((?<word>[-'\\w]+)(?<punctuation>[ ]*[-.,:;?!])?)|(?<paragraph>)\\n");

    public static String getAsString(String resource) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        Parser.class.getClassLoader().getResourceAsStream(resource)));
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = br.readLine()) != null) {
            sb.append(line);
        }
        return sb.toString();
    }

    public static boolean readParagraph(String source, Paragraph paragraph) {
        Matcher matcher = PATTERN_WORD.matcher(source);
        while (matcher.find()) {
            if (matcher.group(GROUP_PARAGRAPH) == null)
                paragraph.add(readSentence(matcher));
        }
        return true;
    }

    private static Sentence readSentence(Matcher matcher) {
        Sentence result = new Sentence(words);
        while (fillSentence(matcher, result)) {
            if (!matcher.find()) break;
        }
        return result;
    }

    private static boolean fillSentence(Matcher matcher, Sentence sentence) {
        if (matcher.group(GROUP_PARAGRAPH) != null) return false;
        if (matcher.group(GROUP_PUNCTUATION) != null) {
            sentence.add(new Word(matcher.group(GROUP_WORD)));
            return !matcher.group(GROUP_PUNCTUATION).contains(".");
        } else {
            sentence.add(new Word(matcher.group(GROUP_WORD)));
            return true;
        }
    }
}
