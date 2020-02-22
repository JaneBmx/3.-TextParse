package parser.impl;

import entity.Component;
import entity.ComponentType;
import entity.Composite;
import parser.Parser;

public class NumberParser implements Parser {
    private SymbolParser parser;

    @Override
    public Composite parse(String text) {
        Composite numberComposite = new Composite(ComponentType.NUMBER);

        char[] digits = text.toCharArray();
        for (char digit : digits) {
            Component numberComponent = parser.parse(String.valueOf(digit));
            numberComposite.add(numberComponent);
        }
        return numberComposite;
    }
}
