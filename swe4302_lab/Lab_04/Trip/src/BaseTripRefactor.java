public class BaseTripRefactor{
    public VehicleType vehicleType;
    public int distanceKM ;
    public int timeMinutes ;
    public int numberOfPassengers ;

    public BaseTripRefactor(VehicleType vehicleType, int distanceKM, int timeMinutes, int numberOfPassengers) {
        this.vehicleType = vehicleType;
        this.distanceKM = distanceKM;
        this.timeMinutes = timeMinutes;
        this.numberOfPassengers = numberOfPassengers;
    }
}
