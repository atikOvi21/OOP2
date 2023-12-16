package MultiBound;

public class ProductPrinter<Thingy extends Product & Printable> {
    private final Thingy product;

    public ProductPrinter(Thingy product) {
        this.product = product;
    }

    public void printProductDetails() {
        System.out.println("Product Name: " + product.getName());
        product.print();
    }
}
