package structural.adapter;

class ConcreteAdaptee implements Adaptee {
    @Override
    public void specificRequest() {
        System.out.println("ConcreteAdaptee.specificRequest()");
    }
}
