public class Rectangle implements IShape {
    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public String draw() {
        return "Drew a Rectangle of length " + length + " and width " + width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}
