package MultiBound;

public class Main {
    public static void main(String[] args) {
        ElectronicProduct electronicProduct = new ElectronicProduct("iPhone15Pro", "Apple");
        ProductPrinter<ElectronicProduct> printer = new ProductPrinter<>(electronicProduct);
        printer.printProductDetails();
    }
}
