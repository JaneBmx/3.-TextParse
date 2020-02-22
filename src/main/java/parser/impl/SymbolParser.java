package parser.impl;

import entity.Component;
import entity.Symbol;
import parser.Parser;

public class SymbolParser implements Parser {

    @Override
    public Component parse(String text) {
        return new Symbol(text.charAt(0));
    }
}