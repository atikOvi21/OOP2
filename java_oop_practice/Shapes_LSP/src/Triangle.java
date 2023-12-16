import java.text.DecimalFormat;

class Triangle extends Shape {
    private final double base;
    private final double height;
    private static final DecimalFormat dfZero = new DecimalFormat("0.00");


    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return Double.parseDouble(dfZero.format(Math.round(0.5 * base * height)));
    }
}