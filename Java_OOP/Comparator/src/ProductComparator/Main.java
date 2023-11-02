package ProductComparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Keyboard", 20.0));
        products.add(new Product(3, "Monitor", 100.0));
        products.add(new Product(2, "Mouse", 10.0));
        products.add(new Product(4, "Printer", 150.0));

        for (Product product : products) {
            System.out.println(product.getName() + " " + product.getPrice());
        }

        Comparator<Product> productComparator = new ProductComparator();
        products.sort(productComparator);
        System.out.println("After sorting:");
        for (Product product : products){
            System.out.println(product.getName() + " " + product.getPrice());
        }
    }
}
