public class SedanRide extends Ride implements IRide, IFare{
    public SedanRide(int distance, int numberOfPassengers) {
        super(distance, numberOfPassengers);
    }

    @Override
    public boolean isRideValid() {
        return numberOfPassengers <= 4 && distance <= 25;
    }

    @Override
    public int getFare() {
        int fare = (50 + distance * 30) / numberOfPassengers;

        return fare - (fare % 5);
    }
}
