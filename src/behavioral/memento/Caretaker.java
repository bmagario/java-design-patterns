package behavioral.memento;

public class Caretaker {

    private Memento memento;

    public void save(Originator originator) {
        memento = originator.save();
    }

    public void restore(Originator originator) {
        originator.restore(memento);
    }

}
