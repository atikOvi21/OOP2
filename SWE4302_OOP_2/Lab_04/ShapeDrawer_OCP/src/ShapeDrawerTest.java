import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapeDrawerTest {
    private Canvas canvas;

    @BeforeEach
    public void setup() {
        canvas = new Canvas();
    }

    @Test
    public void testDrawCircle() {
        Circle circle = new Circle( 5);
        canvas.addShape(circle);

        canvas.drawAll();

        List<String> outputStrings = canvas.getOutputStrings();

        assertEquals(1, outputStrings.size());
        assertEquals("Drew a Circle of radius 5.0", outputStrings.get(0));
    }

    @Test
    public void testDrawRectangle() {
        Rectangle rectangle = new Rectangle( 15, 10);
        canvas.addShape(rectangle);

        canvas.drawAll();

        List<String> outputStrings = canvas.getOutputStrings();

        assertEquals(1, outputStrings.size());
        assertEquals("Drew a Rectangle of length 15.0 and width 10.0", outputStrings.get(0));
    }

    @Test
    public void testDrawSquare() {
        Square square = new Square( 8);
        canvas.addShape(square);

        canvas.drawAll();

        List<String> outputStrings = canvas.getOutputStrings();

        assertEquals(1, outputStrings.size());
        assertEquals("Drew a Square of side 8.0", outputStrings.get(0));
    }

    @Test
    public void testDrawMultipleShapes() {
        Circle circle = new Circle( 5);
        Rectangle rectangle = new Rectangle( 15, 10);
        Square square = new Square( 8);

        canvas.addShape(circle);
        canvas.addShape(rectangle);
        canvas.addShape(square);

        canvas.drawAll();

        List<String> outputStrings = canvas.getOutputStrings();

        assertEquals(3, outputStrings.size());
        assertEquals("Drew a Circle of radius 5.0", outputStrings.get(0));
        assertEquals("Drew a Rectangle of length 15.0 and width 10.0", outputStrings.get(1));
        assertEquals("Drew a Square of side 8.0", outputStrings.get(2));
    }
}
