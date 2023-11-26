package LockedBufferImpl;

public class Order {
    private final int id;
    private String dish;
    private final String[] dishes = {"Burger", "Pizza", "Pasta"};

    public Order(int id) {
        this.id = id;
        setRandomDish();
    }

    public int getId() {
        return id;
    }

    public String getDish() {
        return dish;
    }

    private void setRandomDish() {
        this.dish = dishes[(int) (Math.random() * dishes.length)];
    }
}
