package Behavioral_Patterns.Adapter;

public class LegacyRectangle {
    private final int width;
    private final int height;

    public LegacyRectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
