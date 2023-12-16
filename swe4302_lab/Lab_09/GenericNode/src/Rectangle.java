public class Rectangle extends Shape_2D{
    private final double length;
    private final double width;

    public Rectangle(String name, String color, double area, double length, double width) {
        super(name, color, area);
        this.length = length;
        this.width = width;
    }

    @Override
    public void printShape() {
        super.printShape();
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
    }
}
