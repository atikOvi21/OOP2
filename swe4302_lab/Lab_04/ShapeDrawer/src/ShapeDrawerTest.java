import org.junit.Assert;
import org.junit.Test;

public class ShapeDrawerTest {

    Circle circle = new Circle(10, 20, 5);
    Rectangle rectangle = new Rectangle(30, 40, 15, 10);
    Square square = new Square(50, 60, 8);

    Canvas canvas = new Canvas(circle, rectangle, square);

    @Test
    public void Draw_Circle_Test() {
        String expected = "Drew a Circle of radius 5.0";
        String result =  canvas.drawAll(ShapeType.CIRCLE);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void Draw_Rectangle_Test() {
        String expected = "Drew a Rectangle of length 15.0 and width 10.0";
        String result =  canvas.drawAll(ShapeType.RECTANGLE);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void Draw_Square_Test() {
        String expected = "Drew a Square of side 8.0";
        String result =  canvas.drawAll(ShapeType.SQUARE);

        Assert.assertEquals(expected, result);
    }
}
