public class StationaryProductFactory implements IProductFactory {
    public IProduct CreateProduct() {
        return new StationaryProduct();
    }
}
