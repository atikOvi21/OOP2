public class VehicleManager {
    public void StartVehicle(Vehicle vehicle) {
        vehicle.Start();
    }

    public void StopVehicle(Vehicle vehicle) {
        vehicle.Stop();
    }

    public void AccelerateVehicle(Vehicle vehicle) {
        if (vehicle instanceof IDriveable) {
            ((IDriveable) vehicle).AccelerateEngine();
        }
    }

    public void RideVehicle(Vehicle vehicle) {
        if (vehicle instanceof IRideable) {
            ((IRideable) vehicle).Ride();
        }
    }

}
