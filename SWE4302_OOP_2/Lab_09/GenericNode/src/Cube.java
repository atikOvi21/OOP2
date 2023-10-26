public class Cube extends Shape_3D{
    private final double sideLength;

    public Cube(String name, String color, double volume, double sideLength) {
        super(name, color, volume);
        this.sideLength = sideLength;
    }

    @Override
    public void printShape() {
        super.printShape();
        System.out.println("Side Length: " + sideLength);
    }
}
