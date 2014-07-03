package com.epam.anya.servlet.entity;

import java.util.List;

public interface CompoundText<T extends TextPart>{
    T getElement(int index);
}

//public class CompoundText<T> {
//    private List<T> components;
//
//}
//
//class SText extends CompoundText<Paragraph>{
//
//}
//
//class Paragraph extends CompoundText<Sentence>{
//
//}
