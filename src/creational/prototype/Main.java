package creational.prototype;

public class Main {
    public static void main(String[] args) {
        CharacterFactory factory = new CharacterFactory();

        ConcreteCharacter prototype = new ConcreteCharacter(
                "R2I2",
                "Marcin",
                "Robotic");

        Character character = factory.createCharacter(prototype);

        System.out.println(character.getName());
        System.out.println(character.getRace());
        System.out.println(character.getAppearance());
    }
}