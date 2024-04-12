package equipment.armor;

import equipment.Equipment;

public abstract class Armor extends Equipment {
    private final int protection;

    public Armor(String name, int protection, int price) {
        super(name, price);
        this.protection = protection;
    }

    public int getProtection() {
        return protection;
    }
}