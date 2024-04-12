package model;

import equipment.armor.Armor;
import equipment.weapon.Weapon;

public abstract class BaseEntity {
    private Armor armor = null;
    private Weapon weapon = null;
    private final String name;
    private final int damage;
    private int health;
    private int money;

    public BaseEntity(String name, int damage, int health, int money) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.money = money;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getMoney() {
        return money;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void hit(BaseEntity oppositeBaseEntity) {
        int weaponDamage;
        int oppositeProtection;
        int totalDamage;


        if (this.weapon == null) weaponDamage = 0;
        else weaponDamage = this.weapon.getDamage();

        if (oppositeBaseEntity.armor == null) oppositeProtection = 0;
        else oppositeProtection = oppositeBaseEntity.armor.getProtection();

        totalDamage = weaponDamage + this.damage;
        if (totalDamage <= oppositeProtection) {
            totalDamage = 0;
        } else {
            totalDamage -= oppositeProtection;
        }

        oppositeBaseEntity.setHealth(oppositeBaseEntity.getHealth() - totalDamage);
        if (oppositeBaseEntity.getHealth() <= 0) oppositeBaseEntity.setHealth(0);
    }
}