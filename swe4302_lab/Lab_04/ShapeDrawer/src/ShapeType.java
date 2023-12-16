public enum ShapeType {
    CIRCLE("Circle"),
    SQUARE("Square"),
    RECTANGLE("Rectangle");

    private final String displayName;

    ShapeType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
