public class SedanTrip extends BaseTripRefactor implements IVehicle{
    public SedanTrip(VehicleType vehicleType, int distanceKM, int timeMinutes, int numberOfPassengers) {
        super(vehicleType,distanceKM, timeMinutes, numberOfPassengers);
    }

    @Override
    public boolean canTakeTrip() {
        if ( numberOfPassengers < 1)
            return false ;

        return numberOfPassengers <= 4 && distanceKM <= 25;
    }

    @Override
    public int perHeadFare() {
        int fare = -1;

        fare = (50 + distanceKM * 30 + timeMinutes * 2) / numberOfPassengers;

        return fare - ( fare % 5) ;
    }
}
