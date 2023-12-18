public class FoodProduct implements IProduct {
    public int CalculateDiscountedPrice(int price, int age) {
        return price - age / 10;
    }

    public boolean IsExpired(int days) {
        return days > 5;
    }

    public double CalculateVAT() {
        return 0.025;
    }
}
