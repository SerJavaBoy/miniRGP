package enemy;

import hero.Hero;

public abstract class Enemy<E extends Enemy<E>> {

    private String name;
    private int maxHP;
    private int currentHP;
    private int impactForce;


    public Enemy(String name, int maxHP, int impactForce) {
        this.name = name;
        this.maxHP = maxHP;
        this.currentHP = maxHP;
        this.impactForce = impactForce;
    }



    public boolean isLive() {
        return currentHP > 0;
    }

    public void takeDamage(Hero<? extends Hero> hero) {
                this.currentHP = Math.max(0, currentHP - hero.getWeapon().getDamageDealt());
    }


    public String getName() {
        return name;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public int getCurrentHP() {
        return currentHP;
    }

    public void setCurrentHP(int currentHP) {
        this.currentHP = currentHP;
    }

    public int getImpactForce() {
        return impactForce;
    }
}
