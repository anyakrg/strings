package com.epam.anya.servlet.entity;

import java.util.ArrayList;
import java.util.List;

abstract class AbstractCompoundText<T extends TextPart> implements CompoundText {
    public List<T> elements;

    public AbstractCompoundText() {
        elements = new ArrayList<T>();
    }

    @Override
    public String toString() {
        String s = "";
        for (T element : elements) {
            s += element.toString();
        }
        return s;
    }
}
