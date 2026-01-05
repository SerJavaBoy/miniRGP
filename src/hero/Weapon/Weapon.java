package hero.Weapon;

import hero.Hero;

public abstract class Weapon<H extends Hero<H>> {
    private final String name;
    private final int damageDealt;

    protected Weapon(String name, int damageDealt) {
        this.name = name;
        this.damageDealt = damageDealt;
    }

    public String getName() { return name; }
    public int getDamageDealt() { return damageDealt; }
}
