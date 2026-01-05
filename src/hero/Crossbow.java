package hero;

public class Crossbow<Archer> extends Weapon<hero.Archer> {
    public Crossbow(String name, int damageDealt) {
        super(name, damageDealt);
    }
}
