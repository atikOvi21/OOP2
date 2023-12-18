public class SwitchDIP {
    private final IBulb bulb;

    public SwitchDIP(IBulb bulb) {
        this.bulb = bulb; // Dependency is injected through the constructor.
    }

    public void operate() {
        if (bulb != null) {
            if (!bulb.isOn()) {
                bulb.turnOn();
            } else {
                bulb.turnOff();
            }
        }
    }
}
