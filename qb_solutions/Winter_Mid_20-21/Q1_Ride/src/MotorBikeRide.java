public class MotorBikeRide extends Ride implements IRide, IFare{
    public MotorBikeRide(int distance, int numberOfPassengers) {
        super(distance, numberOfPassengers);
    }

    @Override
    public boolean isRideValid() {
        return numberOfPassengers == 1 && distance <= 10;
    }

    @Override
    public int getFare() {
        int fare = Math.max(25, distance * 20) / numberOfPassengers;

        return fare - (fare % 5);
    }
}
