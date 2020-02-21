package entity;

import iterator.NullIterator;

import java.util.Iterator;

public class Symbol extends TextComponent {
    private char symbol;

    public Symbol(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public Iterator<TextComponent> createIterator(){
        return new NullIterator();
    }

    @Override
    void print() {
        super.print();
    }
}
