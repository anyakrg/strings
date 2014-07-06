package com.epam.anya.servlet.entity;

import java.util.List;

public class AbstractCompoundText<T extends TextPart> implements CompoundText {
    private List<T> elements;

    @Override
    public TextPart getElement(int index) {
        return null;
    }
}
