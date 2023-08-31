public class Circle extends Shape{
    private final double radius;

    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public String draw() {
        return "Drew a Circle of radius " + radius;
    }
}