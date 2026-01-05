package hero.equipment;

import hero.Hero;

public abstract class Armor<H extends Hero<H>> {
    private final String name;
    private final int defense;

    protected Armor(String name, int defense) {
        this.name = name;
        this.defense = defense;
    }

    public String getName() { return name; }
    public int getDefense() { return defense; }
}
