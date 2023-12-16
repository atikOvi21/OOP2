public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(10, 20, 5);
        Rectangle rectangle = new Rectangle(30, 40, 15, 10);
        Square square = new Square(50, 60, 8);

        Canvas canvas = new Canvas(circle, rectangle, square);

        String circleDraw =  canvas.drawAll(ShapeType.CIRCLE);
        String reactAngleDraw = canvas.drawAll(ShapeType.RECTANGLE);
        String squareDraw = canvas.drawAll(ShapeType.SQUARE);

        System.out.println(circleDraw);
        System.out.println(reactAngleDraw);
        System.out.println(squareDraw);
    }
}