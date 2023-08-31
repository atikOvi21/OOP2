public class MotorBikeTrip extends BaseTripRefactor implements IVehicle{
    public MotorBikeTrip(VehicleType vehicleType, int distanceKM, int timeMinutes, int numberOfPassengers) {
        super(vehicleType, distanceKM, timeMinutes, numberOfPassengers);
    }

    @Override
    public boolean canTakeTrip() {
        if ( numberOfPassengers < 1)
            return false ;

        return numberOfPassengers <= 1 && distanceKM <= 10;
    }

    @Override
    public int perHeadFare() {
        int fare = -1;

        fare = Math.max(25, distanceKM * 20) / numberOfPassengers;

        return fare - ( fare % 5) ;
    }
}
