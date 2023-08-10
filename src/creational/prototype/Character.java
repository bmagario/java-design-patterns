package creational.prototype;

interface Character extends Cloneable {
    String getName();
    String getRace();
    String getAppearance();

    Character clone();
}