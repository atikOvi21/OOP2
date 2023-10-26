public class Triangle extends Shape_2D{
    private final double base;
    private final double height;

    public Triangle(String name, String color, double area, double base, double height) {
        super(name, color, area);
        this.base = base;
        this.height = height;
    }

    @Override
    public void printShape() {
        super.printShape();
        System.out.println("Base: " + base);
        System.out.println("Height: " + height);
    }
}
