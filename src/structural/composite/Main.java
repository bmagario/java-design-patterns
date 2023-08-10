package structural.composite;

public class Main {
    public static void main(String[] args) {
        Composite composite = new Composite();

        composite.add(new Leaf("Leaf1"));
        composite.add(new Leaf("Leaf2"));

        composite.operation();
    }
}
