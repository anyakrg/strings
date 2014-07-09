package com.epam.anya.servlet.entity;

import java.util.Collection;

public class Paragraph extends AbstractCompoundText<Sentence> implements TextPart{
    public Collection<? extends Sentence> parts;
}
