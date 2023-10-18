package Behavioral_Patterns.Adapter;

public class RectangleAdapter implements ModernSquare{
    private final LegacyRectangle legacyRectangle;

    public RectangleAdapter(LegacyRectangle legacyRectangle) {
        this.legacyRectangle = legacyRectangle;
    }

    @Override
    public int getSideLength() {
        return (int) Math.sqrt(legacyRectangle.getWidth() * legacyRectangle.getHeight());
    }
}
