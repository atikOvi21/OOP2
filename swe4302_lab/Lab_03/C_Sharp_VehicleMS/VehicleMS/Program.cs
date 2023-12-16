namespace VehicleMS
{
    class Program
    {
        static void Main(string[] args)
        {
            BiCycle biCycle = new BiCycle("Falcon");
            Bus bus = new Bus("Anabil", FuelType.DIESEL);

            VehicleManager vehicleManager = new VehicleManager();

            vehicleManager.StartVehicle(biCycle);
            vehicleManager.RideVehicle(biCycle);
            vehicleManager.StopVehicle(biCycle);

            Console.WriteLine("\n");

            vehicleManager.StartVehicle(bus);
            vehicleManager.AccelerateVehicle(bus);
            vehicleManager.StopVehicle(bus);
        }
    }
}