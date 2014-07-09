package com.epam.anya.servlet.entity;

import java.util.Collection;

public class Sentence extends Symbol implements TextPart {
    public Type type;
    public Collection<? extends SentencePart> parts;

    public Sentence(String content) {
        super(content);
    }

    public enum Type {
        DECLARATIVE, INTERROGATIVE, EXCLAMATORY_IMPERATIVE;

        @Override
        public String toString() {
            return super.toString().toLowerCase();
        }
    }
}
