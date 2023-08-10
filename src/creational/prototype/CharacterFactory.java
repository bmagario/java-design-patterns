package creational.prototype;

class CharacterFactory {
    public static Character createCharacter(Character character) {
        return character.clone();
    }
}
