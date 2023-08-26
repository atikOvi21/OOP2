namespace VehicleMS
{
    public class VehicleManager
    {
        public void StartVehicle(Vehicle vehicle)
        {
            vehicle.Start();
        }

        public void StopVehicle(Vehicle vehicle)
        {
            vehicle.Stop();
        }

        public void AccelerateVehicle(Vehicle vehicle)
        {
            if (vehicle is IDriveable driveable)
            {
                driveable.AccelerateEngine();
            }
        }

        public void RideVehicle(Vehicle vehicle)
        {
            if (vehicle is IRideable rideable)
            {
                rideable.Ride();
            }
        }
    }

}
