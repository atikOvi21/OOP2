public class Rectangle extends Shape {
    private final double length;
    private final double width;

    public Rectangle(double x, double y, double length, double width) {
        super(x, y);
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public String draw() {
        return "Drew a Rectangle of length " + length + " and width " + width;
    }
}