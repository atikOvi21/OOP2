namespace VehicleMS
{
    public enum FuelType
    {
        DIESEL,
        PETROL,
        GASOLINE
    }

    public class Bus : Vehicle, IDriveable
    {
        private readonly FuelType fuelType;

        public Bus(string name, FuelType fuelType) : base(name)
        {
            this.fuelType = fuelType;
        }

        public void AccelerateEngine()
        {
            Console.WriteLine(Name + " bus is accelerating engine with " + fuelType + " fuel");
        }
    }
}
