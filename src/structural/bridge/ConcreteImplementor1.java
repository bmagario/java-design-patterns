package structural.bridge;

class ConcreteImplementor1 implements Implementor {
    @Override
    public void operationImpl() {
        System.out.println("ConcreteImplementor1.operationImpl()");
    }
}
