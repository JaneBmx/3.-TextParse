package entity;

import java.util.Iterator;

public interface Component {
    default void add(Component component) {
        throw new UnsupportedOperationException();
    }

    default void remove(Component component) {
        throw new UnsupportedOperationException();
    }

    default Component getChild(int index) {
        throw new UnsupportedOperationException();
    }

    default Iterator<Component> getIterator() {
        throw new UnsupportedOperationException();
    }

    //default String toString() {
     //   throw new UnsupportedOperationException();
    //}

    default int getCountComponents() {
        throw new UnsupportedOperationException();
    }

    default ComponentType getComponentType(){
        throw new UnsupportedOperationException();
    }
}
