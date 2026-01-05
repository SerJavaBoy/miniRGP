package hero;

import hero.Weapon.Weapon;
import hero.equipment.Armor;

public class Archer extends Hero<Archer>{

    public Archer(String name, int maxHP, Weapon<Archer> weapon, Armor<Archer> armor) {
        super(name, maxHP, weapon, armor);
    }
}
