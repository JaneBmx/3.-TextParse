package iterator;

import entity.TextComponent;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator {
    private Stack<Iterator<TextComponent>> stack = new Stack<>();

    public CompositeIterator(Iterator<TextComponent> iterator) {
        stack.push(iterator);
    }

    public Object next() {
        if (hasNext()) {
            Iterator<TextComponent> iterator = stack.peek();
            TextComponent textComponent = iterator.next();
            stack.push(textComponent.getIterator());
            return textComponent;
        }
        return null;
    }

    @Override
    public boolean hasNext() {
        if (!stack.empty()) {
            Iterator<TextComponent> iterator = stack.peek();
            if (!iterator.hasNext()) {
                stack.pop();
                return hasNext();
            }
            return true;
        }
        return false;
    }
}
