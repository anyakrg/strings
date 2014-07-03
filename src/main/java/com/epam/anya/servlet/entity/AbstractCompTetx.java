package com.epam.anya.servlet.entity;

import java.util.List;

public class AbstractCompTetx <T extends TextPart> implements CompoundText {

    @Override
    public TextPart getElement(int index) {
        return null;
    }
}
