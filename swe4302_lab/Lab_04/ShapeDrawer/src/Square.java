public class Square extends Shape{
    private final double sideLength;

    public Square(double x, double y, double sideLength) {
        super(x, y);
        this.sideLength = sideLength;
    }

    public double calculateArea() {
        return sideLength * sideLength;
    }

    public String draw() {
        return "Drew a Square of side " + sideLength;
    }
}