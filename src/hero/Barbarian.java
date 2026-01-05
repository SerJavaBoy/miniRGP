package hero;

import hero.Weapon.Weapon;
import hero.equipment.Armor;

public class Barbarian extends Hero<Barbarian>{

    public Barbarian(String name, int maxHP, Weapon<Barbarian> weapon, Armor<Barbarian> armor) {
        super(name, maxHP, weapon, armor);
    }
}
