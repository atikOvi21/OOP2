public class SevenSeaterTrip extends BaseTripRefactor implements IVehicle{

    public SevenSeaterTrip(VehicleType vehicleType, int distanceKM, int timeMinutes, int numberOfPassengers) {
        super(vehicleType, distanceKM, timeMinutes, numberOfPassengers);
    }

    @Override
    public boolean canTakeTrip() {
        if ( numberOfPassengers < 1)
            return false ;

        return numberOfPassengers <= 7 && distanceKM >= 10;
    }

    @Override
    public int perHeadFare() {
        int fare = -1;

        if (distanceKM < 10) fare = 300 / numberOfPassengers;
        else fare = distanceKM * 30 / numberOfPassengers;

        return fare - ( fare % 5) ;
    }
}
