package MultiBound;

public class ElectronicProduct extends Product implements Printable {
    private final String brand;

    public ElectronicProduct(String name, String brand) {
        super(name);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public void print() {
        System.out.println("Brand: " + getBrand());
    }
}
