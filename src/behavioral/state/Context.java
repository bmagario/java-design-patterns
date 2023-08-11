package behavioral.state;

public class Context {

    private State state;

    public Context() {
        state = new ConcreteState1();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void doAction() {
        state.doAction();
    }

}
