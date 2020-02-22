package parser;

import entity.Component;
import entity.ComponentType;
import entity.Composite;

import java.util.Arrays;
import java.util.List;

import static parser.Regex.*;

public class SentenceParser implements Parser {
    private LexemeParser parser;

    @Override
    public Composite parse(String text) {
        List<String> lexemesInStrings = Arrays.asList(text.split(SENTENCE_SPLIT_REGEX));
        Composite sentenceComposite = new Composite(ComponentType.SENTENCE);
        for (String lexeme : lexemesInStrings) {
            Component lexemeComposite = parser.parse(lexeme);
            sentenceComposite.add(lexemeComposite);
        }
        return sentenceComposite;
    }
}
