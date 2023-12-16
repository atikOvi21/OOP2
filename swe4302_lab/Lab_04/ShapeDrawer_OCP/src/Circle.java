public class Circle implements IShape{

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String draw() {
        return "Drew a Circle of radius " + radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
