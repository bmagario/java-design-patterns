package behavioral.visitor;

public class ConcreteVisitor2 implements Visitor {

    @Override
    public void visitConcreteElement1(ConcreteElement1 concreteElement1) {
        System.out.println("ConcreteVisitor2 visited ConcreteElement1");
    }

    @Override
    public void visitConcreteElement2(ConcreteElement2 concreteElement2) {
        System.out.println("ConcreteVisitor2 visited ConcreteElement2");
    }

}
