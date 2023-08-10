package structural.composite;

class Leaf implements Component {
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println("Leaf " + name + ".operation()");
    }

    @Override
    public void add(Component component) {
        throw new UnsupportedOperationException("Leaf does not support add()");
    }

    @Override
    public void remove(Component component) {
        throw new UnsupportedOperationException("Leaf does not support remove()");
    }

    @Override
    public Component getChild(int index) {
        throw new UnsupportedOperationException("Leaf does not support getChild()");
    }
}
