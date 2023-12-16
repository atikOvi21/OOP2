public enum VehicleType {
    SEDAN("Sedan"),
    MOTOR_BIKE("Motor Bike"),
    SEVEN_SEATER("Seven Seater");

    private final String displayName;

    VehicleType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}

