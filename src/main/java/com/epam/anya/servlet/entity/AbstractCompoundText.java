package com.epam.anya.servlet.entity;

import java.util.List;

public class AbstractCompoundText<T> implements CompoundText {
    private List<T> elements;

    @Override
    public Object getElement(int index) {
        return null;
       }
}
