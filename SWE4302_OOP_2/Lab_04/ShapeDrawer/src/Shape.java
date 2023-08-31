public abstract class Shape {
    private final double x;
    private final double y;

    public Shape(double x, double y) {
     this.x = x;
     this.y = y;
    }

    public abstract double calculateArea();

    public abstract String draw();
}

