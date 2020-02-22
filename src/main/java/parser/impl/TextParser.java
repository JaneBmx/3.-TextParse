package parser.impl;

import entity.Component;
import entity.ComponentType;
import entity.Composite;
import parser.Parser;

import static parser.Regex.*;

public class TextParser implements Parser {
    private ParagraphParser parser;

    @Override
    public Composite parse(String text) {
        String[] paragraphsInStrings = text.split(TEXT_SPLIT_REGEX);
        Composite textComposite = new Composite(ComponentType.TEXT);
        for (String paragraph : paragraphsInStrings) {
            Component paragraphComposite = parser.parse(paragraph.trim());
            textComposite.add(paragraphComposite);
        }
        return textComposite;
    }
}
