package CommonComparator;

public class Product implements Sortable{
    private final String name;

    public Product(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
