namespace VehicleMS
{
    public class BiCycle : Vehicle, IRideable
    {
        public BiCycle(string name) : base(name)
        {
        }

        public void Ride()
        {
            Console.WriteLine(Name + " bicycle is being ridden");
        }
    }
}
