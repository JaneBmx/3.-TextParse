package entity;

import java.util.Iterator;

public abstract class TextComponent {
    public void add(TextComponent textComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(TextComponent textComponent) {
        throw new UnsupportedOperationException();
    }

    public TextComponent getChild(int index) {
        throw new UnsupportedOperationException();
    }

    public Iterator<TextComponent> getIterator() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        throw new UnsupportedOperationException();
    }

    public int getCountComponents() {
        throw new UnsupportedOperationException();
    }

    public ComponentType getComponentType(){
        throw new UnsupportedOperationException();
    }
}
