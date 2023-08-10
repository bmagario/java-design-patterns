package structural.flyweight;

public class Main {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();

        Flyweight flyweight1 = flyweightFactory.getFlyweight(1);
        flyweight1.draw(10, 20, 1);

        Flyweight flyweight2 = flyweightFactory.getFlyweight(2);
        flyweight2.draw(30, 40, 2);

        Flyweight flyweight3 = flyweightFactory.getFlyweight(1);
        flyweight3.draw(50, 60, 1);

        // Only two flyweights are created, even though three objects are created.
    }
}
