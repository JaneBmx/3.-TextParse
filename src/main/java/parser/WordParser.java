package parser;

import entity.ComponentType;
import entity.Component;
import entity.Composite;

public class WordParser implements Parser {
    private SymbolParser parser;

    @Override
    public Composite parse(String text) {
        Composite component = new Composite(ComponentType.WORD);
        char[] symbols = text.toCharArray();
        for (char symbol : symbols) {
            Component textComponent = parser.parse(String.valueOf(symbol));
            component.add(textComponent);
        }
        return component;
    }
}
