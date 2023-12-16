package MultipleObjects;

import java.io.Serial;
import java.io.Serializable;

public class Product implements Serializable {
    @Serial
    private static final long serialVersionUID = 2L;
    private final String name;
    private final double price;
    private final int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return STR."Product [name= \{ name }, price= \{ price }, quantity= \{ quantity }]";
    }
}
