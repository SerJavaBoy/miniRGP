package hero;

import enemy.Enemy;

public abstract class Hero {

    private Weapon weapon;
    private String name;
    private int maxHP;
    private int currentHP; //текущее HP
    private int startArmor;


    public Hero(Weapon typeWeapon, String name, int maxHP, int startArmor) {
        this.weapon = typeWeapon;
        this.name = name;
        this.maxHP = maxHP;
        this.startArmor = startArmor;
        this.currentHP = startArmor+ maxHP;
    }

    public boolean isLive(){
        return currentHP > 0;
    }

    public void takeDamage(int damage){ // получать урон
        this.currentHP -= damage;

    }

    public void causeDamage(Enemy enemy){
        enemy.setCurrentHP(enemy.getCurrentHP()-weapon.getDamageDealt());
    }


    public Weapon getWeapon() {
        return weapon;
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

    public int getStartArmor() {
        return startArmor;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "typeWeapon=" + weapon +
                ", name='" + name + '\'' +
                ", maxHP=" + maxHP +
                ", currentHP=" + currentHP +
                ", startArmor=" + startArmor +
                '}';
    }

    public void setCurrentHP(int currentHP) {
        this.currentHP = currentHP;
    }
}
