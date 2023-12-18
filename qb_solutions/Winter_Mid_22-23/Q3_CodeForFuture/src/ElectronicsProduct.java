public class ElectronicsProduct implements IProduct {
    public int CalculateDiscountedPrice(int price, int age) {
        return price - Math.min(price / 5, 100);
    }

    public boolean IsExpired(int days) {
        // Electronics products don't have an expiration concept in this example
        return false;
    }

    public double CalculateVAT() {
        return 0.04;
    }
}
