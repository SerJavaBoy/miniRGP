package ring;


import enemy.Enemy;
import hero.Hero;

import java.util.SortedMap;

public class Fight {

    public static void fight(Hero hero, Enemy enemy) {
        while (hero.isLive() && enemy.isLive()) {
            hero.causeDamage(enemy);
            System.out.println("---------------------------------");
            System.out.println("Герой по имени " + hero.getName() + " нанес удар по врагу " + enemy.getName() + " силой " + hero.getWeapon().getDamageDealt());
            System.out.println("У врага осталось жизни: " + enemy.getCurrentHP());
            if (enemy.isLive()) {
                enemy.causeDamage(hero);
                System.out.println("---------------------------------");
                System.out.println("Враг по имени " + enemy.getName() + " нанес удар по герою " + hero.getName() + " силой " + enemy.getImpactForce());
                System.out.println("У героя осталось жизни: " + hero.getCurrentHP());
            }
        }

        if (hero.isLive()) {
            System.out.println("Победил герой по имени:  " + hero.getName());
        } else {
            System.out.println("Победил dhfu по имени:  " + enemy.getName());
        }
    }

}
