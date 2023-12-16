public class LightBulb {
    private boolean lightOn;
    public void turnOn() {
        System.out.println("Light bulb is on.");
        lightOn = true;
    }

    public void turnOff() {
        System.out.println("Light bulb is off.");
        lightOn = false;
    }

    public boolean isOn() {
        return lightOn;
    }
}
