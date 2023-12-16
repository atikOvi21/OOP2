public class Cylinder extends Shape_3D{
    private final double radius;
    private final double height;

    public Cylinder(String name, String color, double volume, double radius, double height) {
        super(name, color, volume);
        this.radius = radius;
        this.height = height;
    }

    @Override
    public void printShape() {
        super.printShape();
        System.out.println("Radius: " + radius);
        System.out.println("Height: " + height);
    }
}
