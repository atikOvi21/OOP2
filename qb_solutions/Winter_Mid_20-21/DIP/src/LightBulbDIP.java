public class LightBulbDIP implements IBulb{
    private boolean lightOn;
    public void turnOn() {
        System.out.println("Light bulb is on.");
        lightOn = true;
    }

    public void turnOff() {
        System.out.println("Light bulb is off.");
        lightOn = false;
    }

    @Override
    public boolean isOn() {
        return lightOn;
    }


}
