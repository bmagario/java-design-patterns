package creational.prototype;

class ConcreteCharacter implements Character {
    private String name;
    private String race;
    private String appearance;

    public ConcreteCharacter(String name, String race, String appearance) {
        this.name = name;
        this.race = race;
        this.appearance = appearance;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getRace() {
        return race;
    }

    @Override
    public String getAppearance() {
        return appearance;
    }

    @Override
    public Character clone() {
        try {
            return (Character) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
