import enemy.Enemy;
import enemy.Goblin;
import hero.Hero;
import hero.Mage;
import hero.equipment.Armor;
import ring.Fight;

public class Main {
    static void main(String[] args) {

        Hero mag = new Mage("Магнум", 200, new hero.Weapon.Spell("Огненый шар", 30), new Armor<Mage>("Мантия", 10) {
        });
        Enemy goblin = new Goblin("Гоблин", 100, 20);
        Fight.fight(mag, goblin);
    }
}
