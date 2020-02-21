package entity;

import java.util.Iterator;

public abstract class TextComponent {
    public void add() {
        throw new UnsupportedOperationException();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

    public void getChild() {
        throw new UnsupportedOperationException();
    }

    public void operation() {
        throw new UnsupportedOperationException();
    }

    public Iterator<TextComponent> createIterator() {
        throw new UnsupportedOperationException();
    }

    void print() {

    }

}
