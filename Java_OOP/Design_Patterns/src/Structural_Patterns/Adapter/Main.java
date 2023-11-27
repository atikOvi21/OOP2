package Structural_Patterns.Adapter;

public class Main {
    public static void main(String[] args) {
        LegacyRectangle legacyRectangle = new LegacyRectangle(4, 6);
        System.out.println("Legacy Rectangle - Width: " + legacyRectangle.getWidth() + ", Height: " + legacyRectangle.getHeight());

        ModernSquare modernSquare = new RectangleAdapter(legacyRectangle);
        System.out.println("Modern Square - Side Length: " + modernSquare.getSideLength());
    }
}