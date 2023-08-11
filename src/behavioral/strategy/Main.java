package behavioral.strategy;

public class Main {

    public static void main(String[] args) {
        Context context = new Context();

        context.setStrategy(new ConcreteStrategy1());

        context.execute();

        context.setStrategy(new ConcreteStrategy2());

        context.execute();
    }

}
