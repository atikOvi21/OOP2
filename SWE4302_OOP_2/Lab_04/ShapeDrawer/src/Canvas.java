public class Canvas {
    private final Circle circle;
    private final Rectangle rectangle;
    private final Square square;

    public Canvas(Circle circle, Rectangle rectangle, Square square) {
        this.circle = circle;
        this.rectangle = rectangle;
        this.square = square;
    }

    public String drawAll(ShapeType shapeType) {
        return switch (shapeType) {
            case CIRCLE -> circle.draw();
            case RECTANGLE -> rectangle.draw();
            case SQUARE -> square.draw();
            default -> throw new IllegalArgumentException("Invalid shape type");
        };
    }
}