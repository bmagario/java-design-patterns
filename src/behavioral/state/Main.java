package behavioral.state;

public class Main {

    public static void main(String[] args) {
        Context context = new Context();

        context.setState(new ConcreteState1());

        context.doAction();

        context.setState(new ConcreteState2());

        context.doAction();
    }

}
