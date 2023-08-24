public enum FuelType {
    DIESEL("Diesel"),
    PETROL("Petrol"),
    GASOLINE("Gasoline");

    private final String displayName;

    FuelType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
