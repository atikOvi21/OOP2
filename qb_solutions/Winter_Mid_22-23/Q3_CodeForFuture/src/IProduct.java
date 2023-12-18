public interface IProduct {
    int CalculateDiscountedPrice(int price, int age);
    boolean IsExpired(int days);
    double CalculateVAT();
}
