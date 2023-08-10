package creational.factory_method;

public class Main {
    public static void main(String[] args) {
        Product product1 = Factory.createProduct("ConcreteProduct1");
        product1.doSomething();

        Product product2 = Factory.createProduct("ConcreteProduct2");
        product2.doSomething();
    }
}
