package iterator;

import entity.Component;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator {
    private Stack<Iterator<Component>> stack = new Stack<>();

    public CompositeIterator(Iterator<Component> iterator) {
        stack.push(iterator);
    }

    public Object next() {
        if (hasNext()) {
            Iterator<Component> iterator = stack.peek();
            Component component = iterator.next();
            stack.push(component.getIterator());
            return component;
        }
        return null;
    }

    @Override
    public boolean hasNext() {
        if (!stack.empty()) {
            Iterator<Component> iterator = stack.peek();
            if (!iterator.hasNext()) {
                stack.pop();
                return hasNext();
            }
            return true;
        }
        return false;
    }
}
