package hero;

import hero.Weapon.Weapon;
import hero.equipment.Armor;

public class Mage extends Hero<Mage>{

    public Mage(String name, int maxHP, Weapon<Mage> weapon, Armor<Mage> armor) {
        super(name, maxHP, weapon, armor);
    }
}
