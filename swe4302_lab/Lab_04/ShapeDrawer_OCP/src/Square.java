public class Square implements IShape{

    private final double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public String draw() {
        return "Drew a Square of side " + sideLength;
    }

    @Override
    public double calculateArea() {
        return sideLength * sideLength;
    }
}
