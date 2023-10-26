public class Shape_2D extends Shape{
    private final double area;

    public Shape_2D(String name, String color, double area) {
        super(name, color);
        this.area = area;
    }

    @Override
    public void printShape() {
        super.printShape();
        System.out.println("Area: " + area);
    }
}
