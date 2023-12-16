import java.text.DecimalFormat;

public class Circle extends Shape{
    private final double radius;
    private static final DecimalFormat dfZero = new DecimalFormat("0.00");

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Double.parseDouble(dfZero.format(Math.PI * radius * radius));
    }
}
