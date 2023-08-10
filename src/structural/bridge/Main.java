package structural.bridge;

// The client code that uses the bridge.
public class Main {
    public static void main(String[] args) {
        Abstraction abstraction = new ConcreteAbstraction1();

        Implementor implementor = new ConcreteImplementor1();

        Bridge bridge = new Bridge(abstraction, implementor);

        bridge.operation();
    }
}
