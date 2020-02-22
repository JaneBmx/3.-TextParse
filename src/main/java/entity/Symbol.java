package entity;

import iterator.NullIterator;

import java.util.Iterator;

public class Symbol extends TextComponent {
    private char symbol;
    private static final ComponentType componentType = ComponentType.SYMBOL;

    public Symbol(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public static ComponentType getComponentType() {
        return componentType;
    }

    @Override
    public Iterator<TextComponent> getIterator() {
        return new NullIterator();
    }

    @Override
    public String toString() {
        return String.valueOf(symbol);
    }
}
