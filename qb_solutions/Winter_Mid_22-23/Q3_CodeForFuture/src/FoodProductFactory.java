public class FoodProductFactory implements IProductFactory {
    public IProduct CreateProduct() {
        return new FoodProduct();
    }
}
