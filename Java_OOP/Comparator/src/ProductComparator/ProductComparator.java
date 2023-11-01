package ProductComparator;

import java.util.Comparator;

public class ProductComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        int priceResult = Double.compare(o1.getPrice(), o2.getPrice());
        if (priceResult != 0) {
            return priceResult;
        }

        int idResult = Integer.compare(o1.getProductId(), o2.getProductId());
        if (idResult != 0) {
            return idResult;
        }

        return o1.getName().compareTo(o2.getName());
    }
}
