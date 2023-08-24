public class Bus extends Vehicle implements IDriveable{
    private final FuelType fuelType;

    public Bus(String name, FuelType fuelType) {
        super(name);
        this.fuelType = fuelType;
    }

    public FuelType getFuelType() {
        return fuelType;
    }
    @Override
    public void AccelerateEngine() {
        System.out.println(name + " bus is accelerating engine with " + getFuelType() + " fuel");
    }
}
