package structural.adapter;

public class Main {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();

        Adapter adapter = new Adapter(new ConcreteAdaptee());

        adapter.request();
    }
}
