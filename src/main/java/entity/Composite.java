package entity;

import iterator.CompositeIterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Composite implements Component {
    private Iterator<Component> iterator = null;
    private ArrayList<Component> components = new ArrayList<>();
    private ComponentType componentType;

    public Composite(ComponentType componentType) {
        this.componentType = componentType;
    }

    public ArrayList<Component> getComponents() {
        return components;
    }

    public void setComponents(ArrayList<Component> components) {
        this.components = components;
    }

    @Override
    public ComponentType getComponentType() {
        return componentType;
    }

    @Override
    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void remove(Component component) {
        components.remove(component);
    }

    @Override
    public Component getChild(int index) {
        return components.get(index);
    }

    @Override
    public Iterator<Component> getIterator() {
        if (iterator == null) {
            iterator = new CompositeIterator(components.iterator());
        }
        return iterator;
    }

    @Override
    public int getCountComponents() {
        return components.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        Iterator<Component> iterator = components.iterator();
        while (iterator.hasNext()) {
            Component component = iterator.next();
            sb.append(component.toString());
        }
        return sb.toString();
    }
}
