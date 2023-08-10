package creational.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton exampleSingleton = Singleton.getInstance();
        System.out.println(exampleSingleton);
        Singleton exampleSingleton2 = Singleton.getInstance();
        System.out.println(exampleSingleton2);
    }
}