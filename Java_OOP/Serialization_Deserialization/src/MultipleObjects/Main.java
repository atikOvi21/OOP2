package MultipleObjects;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProductSerializationManager psm = new ProductSerializationManager("src/MultipleObjects/products.ser");

        Product p1 = new Product("Apple", 1.99, 10);
        Product p2 = new Product("Orange", 2.99, 20);
        Product p3 = new Product("Banana", 3.99, 30);

        psm.serialize(List.of(p1, p2, p3));

        List<Object> objectList = psm.deserialize();

        for (Object obj : objectList) {
            System.out.println(obj.toString());
        }
    }
}
