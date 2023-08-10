package structural.bridge;

class Bridge {
    private Abstraction abstraction;
    private Implementor implementor;

    public Bridge(Abstraction abstraction, Implementor implementor) {
        this.abstraction = abstraction;
        this.implementor = implementor;
    }

    public void operation() {
        abstraction.operation();
        implementor.operationImpl();
    }
}
