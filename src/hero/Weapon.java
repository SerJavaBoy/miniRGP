package hero;

public abstract class Weapon<T extends Hero> {

    private String name;
    private int damageDealt;

    public Weapon(String name, int damageDealt) {
        this.name = name;
        this.damageDealt = damageDealt;
    }

    public String getName() {
        return name;
    }

    public int getDamageDealt() {
        return damageDealt;
    }
}
