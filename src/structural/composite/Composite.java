package structural.composite;

import java.util.ArrayList;
import java.util.List;

class Composite implements Component {
    private List<Component> children = new ArrayList<>();

    public Composite() {
    }

    @Override
    public void operation() {
        for (Component child : children) {
            child.operation();
        }
    }

    @Override
    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public Component getChild(int index) {
        return children.get(index);
    }
}

