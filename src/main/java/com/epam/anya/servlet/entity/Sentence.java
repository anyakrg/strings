package com.epam.anya.servlet.entity;

import java.util.ArrayList;
import java.util.List;

public class Sentence extends Symbol {
    private final List<SentencePart> words;

    public Sentence(List<SentencePart> words) {
        super();
        this.words = words;
    }

    public Sentence() {
        words = new ArrayList<SentencePart>();
    }

    public List<SentencePart> getWords() {
        return words;
    }

    public boolean add(SentencePart word) {
        return words.add(word);
    }

    @Override
    public String toString() {
        return "Sentence{" +
                "words=" + words +
                '}';
    }
}
