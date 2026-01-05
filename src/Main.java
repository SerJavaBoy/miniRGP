import enemy.Enemy;
import enemy.Goblin;
import hero.Crossbow;
import hero.Hero;
import hero.Mage;
import ring.Fight;

public class Main {
    static void main(String[] args) {

        Hero mag = new Mage(new Crossbow<>("Огненый шар", 30), "Магнум", 200, 20 );
        Enemy goblin  = new Goblin("Гоблин", 100, 20);
        Fight.fight(mag, goblin);
    }
}
