package hero;

public abstract class Hero {

    private Weapon typeWeapon;
    private String name;
    private int maxHP;
    private int currentHP; //текущее HP
    private int startArmor;
    private int currentArmor;

    public Hero(Weapon typeWeapon, String name, int maxHP, int startArmor) {
        this.typeWeapon = typeWeapon;
        this.name = name;
        this.maxHP = maxHP;
        this.startArmor = startArmor;
        this.currentHP = maxHP;
    }

    public boolean isLive(){
        return currentArmor > 0;
    }

    public void takeDamage(int damage){
        this.currentHP -= damage;

    }
}
