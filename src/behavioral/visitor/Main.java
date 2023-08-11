package behavioral.visitor;

public class Main {

    public static void main(String[] args) {
        ConcreteElement1 concreteElement1 = new ConcreteElement1();
        ConcreteElement2 concreteElement2 = new ConcreteElement2();

        ConcreteVisitor1 concreteVisitor1 = new ConcreteVisitor1();
        ConcreteVisitor2 concreteVisitor2 = new ConcreteVisitor2();

        concreteElement1.accept(concreteVisitor1);
        concreteElement2.accept(concreteVisitor1);

        concreteElement1.accept(concreteVisitor2);
        concreteElement2.accept(concreteVisitor2);
    }

}
