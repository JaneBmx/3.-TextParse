package parser.impl;

import entity.Component;
import entity.ComponentType;
import entity.Composite;
import parser.Parser;

import java.util.Arrays;
import java.util.List;

import static parser.Regex.*;

public class ParagraphParser implements Parser {
    private SentenceParser parser;

    @Override
    public Composite parse(String text) {
        List<String> sentencesInStrings = Arrays.asList(text.split(PARAGRAPH_SPLIT_REGEX));
        Composite composite = new Composite(ComponentType.PARAGRAPH);

        for (String sentence : sentencesInStrings) {
            Component sentenceComposite = parser.parse(sentence);
            Component dot = parser.parse(".");
            composite.add(sentenceComposite);
            composite.add(dot);
        }
        return composite;
    }
}
