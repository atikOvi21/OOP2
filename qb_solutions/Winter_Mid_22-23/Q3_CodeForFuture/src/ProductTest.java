import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ProductTest {

    public IProductFactory productFactory = new FoodProductFactory();
    public IProduct foodProduct = productFactory.CreateProduct();

    @Test
    public void TestCalculateDiscountedPrice() {
        int price = 100;
        int age = 25;

        assertEquals(98, foodProduct.CalculateDiscountedPrice(price, age));
    }

    @Test
    public void TestIsExpired() {
        assertTrue(foodProduct.IsExpired(6));
    }

    @Test
    public void TestCalculateVAT() {
        assertEquals(0.025, foodProduct.CalculateVAT(), 0.0);
    }
}
