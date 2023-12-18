public class Switch {
    private final LightBulb bulb;

    public Switch() {
        this.bulb = new LightBulb();
    }

    public void operate() {
        if (!bulb.isOn()) {
            bulb.turnOn();
        } else {
            bulb.turnOff();
        }
    }
}
