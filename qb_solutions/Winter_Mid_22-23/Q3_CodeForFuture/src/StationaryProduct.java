public class StationaryProduct implements IProduct {
    public int CalculateDiscountedPrice(int price, int age) {
        return price - 5;
    }

    public boolean IsExpired(int days) {
        // Stationary products don't have an expiration concept in this example
        return false;
    }

    public double CalculateVAT() {
        return 0.05;
    }
}
