package behavioral.mediator;

public class Main {

    public static void main(String[] args) {
        // Create the mediator
        Mediator mediator = new Mediator();

        ConcreteColleague1 colleague1 = new ConcreteColleague1(mediator);
        ConcreteColleague2 colleague2 = new ConcreteColleague2(mediator);

        mediator.addColleague(colleague1);
        mediator.addColleague(colleague2);

        mediator.send("Hello", colleague1);
    }

}
