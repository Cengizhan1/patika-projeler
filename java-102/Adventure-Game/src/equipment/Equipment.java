package equipment;

public abstract class Equipment {
    private final String name;
    private final int price;

    protected Equipment(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}