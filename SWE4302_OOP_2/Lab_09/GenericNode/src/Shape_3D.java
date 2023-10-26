public class Shape_3D extends Shape{
    private final double volume;

    public Shape_3D(String name, String color, double volume) {
        super(name, color);
        this.volume = volume;
    }

    @Override
    public void printShape() {
        super.printShape();
        System.out.println("Volume: " + volume);
    }
}
