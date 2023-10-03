public class SevenSeaterRide extends Ride implements IRide, IFare{
    public SevenSeaterRide(int distance, int numberOfPassengers) {
        super(distance, numberOfPassengers);
    }

    @Override
    public boolean isRideValid() {
        return numberOfPassengers <= 7 && distance >= 10;
    }

    @Override
    public int getFare() {
        int fare = 0;

        if(distance < 10){
            fare = 300/numberOfPassengers;
        } else {
            fare = (distance * 30) / numberOfPassengers;
        }
        return fare - (fare % 5);
    }
}
