public class Main {
    public static void main(String[] args) {

        BiCycle biCycle = new BiCycle("Falcon");

        Bus bus = new Bus("Gazipur-Paribahan", FuelType.DIESEL);

        VehicleManager vehicleManager = new VehicleManager();

        vehicleManager.StartVehicle(biCycle);
        vehicleManager.RideVehicle(biCycle);
        vehicleManager.StopVehicle(biCycle);

        System.out.println("\n");
        vehicleManager.StartVehicle(bus);
        vehicleManager.AccelerateVehicle(bus);
        vehicleManager.StopVehicle(bus);
    }
}