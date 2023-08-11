package behavioral.visitor;

public class ConcreteElement2 extends Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElement2(this);
    }

}
