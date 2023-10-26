public class Circle extends Shape_2D{
    private final double radius;

    public Circle(String name, String color, double area, double radius) {
        super(name, color, area);
        this.radius = radius;
    }

    @Override
    public void printShape() {
        super.printShape();
        System.out.println("Radius: " + radius);
    }
}
