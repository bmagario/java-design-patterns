package structural.decorator;

class ConcreteDecorator1 extends Decorator {
    public ConcreteDecorator1(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println("ConcreteDecorator1.operation()");
    }
}
