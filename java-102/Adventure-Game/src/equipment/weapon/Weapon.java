package equipment.weapon;

import equipment.Equipment;

public abstract class Weapon extends Equipment {
    private final int damage;

    public Weapon(String name, int damage, int price) {
        super(name, price);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}