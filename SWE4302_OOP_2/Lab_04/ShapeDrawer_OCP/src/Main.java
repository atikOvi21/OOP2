import java.util.List;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle( 5);
        Rectangle rectangle = new Rectangle(15, 10);
        Square square = new Square( 8);

        System.out.println("Circle Area : " + circle.calculateArea());
        System.out.println("Square Area : " + square.calculateArea());
        System.out.println("Rectangle Area : " + rectangle.calculateArea());


        Canvas canvas = new Canvas();
        canvas.addShape(circle);
        canvas.addShape(rectangle);
        canvas.addShape(square);

        canvas.drawAll();

        List<String> outputStrings = canvas.getOutputStrings();

        for (String output : outputStrings) {
            System.out.println(output);
        }
    }
}