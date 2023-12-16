import java.util.ArrayList;
import java.util.List;

public class Canvas {
    private final List<IShape> shapes = new ArrayList<>();
    private final List<String> outputStrings = new ArrayList<>();

    public void addShape(IShape shape) {
        shapes.add(shape);
    }

    public void drawAll() {
        for (IShape shape : shapes) {
            String output = shape.draw();
            outputStrings.add(output);
        }
    }

    public List<String> getOutputStrings() {
        return outputStrings;
    }
}
