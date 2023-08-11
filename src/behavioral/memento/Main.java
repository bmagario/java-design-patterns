package behavioral.memento;

public class Main {

    public static void main(String[] args) {
        Originator originator = new Originator();

        originator.setState("State 1");

        Caretaker caretaker = new Caretaker();

        caretaker.save(originator);

        originator.setState("State 2");

        caretaker.restore(originator);

        System.out.println(originator.getState());
    }

}
