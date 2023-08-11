package behavioral.chain_of_responsability;

public class Main {

    public static void main(String[] args) {
        ChainProcessor chainProcessor = new ConcreteProcessor1(new ConcreteProcessor2());
        chainProcessor.doSomething();
    }
}