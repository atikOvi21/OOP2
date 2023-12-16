import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapeTest {

    @Test
    public void testCalculateAreaForCircle() {
        Circle circle = new Circle(5);
        double expectedArea = Math.PI * 5 * 5;
        double actualArea = circle.calculateArea();
        assertEquals(expectedArea, actualArea, 0.001);
    }

    @Test
    public void testCalculateAreaForRectangle() {
        Rectangle rectangle = new Rectangle(15, 10);
        double expectedArea = 15 * 10;
        double actualArea = rectangle.calculateArea();
        assertEquals(expectedArea, actualArea, 0.001);
    }

    @Test
    public void testCalculateAreaForTriangle() {
        Triangle triangle = new Triangle(3, 4);
        double expectedArea = 0.5 * 3 * 4;
        double actualArea = triangle.calculateArea();
        assertEquals(expectedArea, actualArea, 0.001);
    }
}
