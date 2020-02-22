package parser;

import entity.Component;
import entity.Composite;
import entity.Symbol;

public class SymbolParser implements Parser {

    @Override
    public Composite parse(String text) {
        Composite symbol = new Symbol(text.charAt(0));
    }//TODO fix it
}
