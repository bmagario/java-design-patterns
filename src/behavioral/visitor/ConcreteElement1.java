package behavioral.visitor;

public class ConcreteElement1 extends Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElement1(this);
    }

}
