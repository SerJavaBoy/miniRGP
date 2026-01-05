package hero;

public abstract class Weapon {

    private String name;
    private int damageDealt;

    public Weapon(String name, int damageDealt) {
        this.name = name;
        this.damageDealt = damageDealt;
    }
}
