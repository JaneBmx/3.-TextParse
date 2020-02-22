package entity;

import iterator.CompositeIterator;

import java.util.ArrayList;
import java.util.Iterator;

public class TextComposite extends TextComponent {
    Iterator<TextComponent> iterator = null;
    ArrayList<TextComponent> components = new ArrayList<>();

    @Override
    public void add(TextComponent textComponent) {
        components.add(textComponent);
    }

    @Override
    public void remove(TextComponent textComponent) {
        components.remove(textComponent);
    }

    @Override
    public TextComponent getChild(int index) {
        return components.get(index);
    }

    @Override
    public Iterator<TextComponent> getIterator() {
        if (iterator == null) {
            iterator = new CompositeIterator(components.iterator());
        }
        return iterator;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        Iterator<TextComponent> iterator = components.iterator();
        while (iterator.hasNext()) {
            TextComponent textComponent = iterator.next();
            sb.append(textComponent.toString());
        }
        return sb.toString();
    }
}
