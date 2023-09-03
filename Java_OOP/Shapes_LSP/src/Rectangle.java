import java.text.DecimalFormat;

class Rectangle extends Shape {
    private final double width;
    private final double height;
    private static final DecimalFormat dfZero = new DecimalFormat("0.00");


    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return Double.parseDouble(dfZero.format(Math.round(width * height)));
    }
}