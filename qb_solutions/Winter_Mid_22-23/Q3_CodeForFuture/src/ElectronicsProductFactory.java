public class ElectronicsProductFactory implements IProductFactory {
    public IProduct CreateProduct() {
        return new ElectronicsProduct();
    }
}
