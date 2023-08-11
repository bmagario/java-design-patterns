package behavioral.observer;

public class Main {

    public static void main(String[] args) {
        Subject subject = new Subject();

        ConcreteObserver1 observer1 = new ConcreteObserver1();
        ConcreteObserver2 observer2 = new ConcreteObserver2();

        subject.attach(observer1);
        subject.attach(observer2);

        subject.notifyObservers();
    }

}
