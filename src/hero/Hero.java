package hero;

import enemy.Enemy;
import hero.Weapon.Weapon;
import hero.equipment.Armor;

public abstract class Hero<H extends Hero<H>> {
    private Weapon<H> weapon;     // <-- теперь НЕ raw, а типизировано
    private final String name;
    private final int maxHP;
    private int currentHP;
    private Armor<H> armor; // может быть null или “базовая броня”

    public Hero(String name, int maxHP, Weapon<H> weapon, Armor<H> armor) {
        this.name = name;
        this.maxHP = maxHP;
        this.weapon = weapon;
        this.armor = armor;
        this.currentHP = maxHP;
    }

    public Weapon<H> getWeapon() {
        return weapon;
    }

    // Важно: сеттер оружия тоже типизирован
    public void equip(Weapon<H> weapon) {
        this.weapon = weapon;
    }

    public String getName() { return name; }
    public int getCurrentHP() { return currentHP; }

    public void takeDamage(Enemy<? extends Enemy> enemy) {
       int effectiveDamage = Math.max(0, enemy.getImpactForce() - armor.getDefense());
        this.currentHP = Math.max(0, currentHP - effectiveDamage);
    }

    public boolean isLive() {
        return currentHP > 0;
    }
}
