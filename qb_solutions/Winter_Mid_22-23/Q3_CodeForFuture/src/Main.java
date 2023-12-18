public class Main {
    public static void main(String[] args) {
        IProductFactory productFactory = new FoodProductFactory();
        IProduct foodProduct = productFactory.CreateProduct();

        int price = 100;
        int age = 25;

        System.out.println(STR."Discounted Price: \{foodProduct.CalculateDiscountedPrice(price, age)}");
        System.out.println(STR."Is Expired: \{foodProduct.IsExpired(6)}");
        System.out.println(STR."VAT: \{foodProduct.CalculateVAT()}");
    }
}