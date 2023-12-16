import org.junit.Assert;
import org.junit.Test;

public class TripTest {

// For The basic Trip class with Switch Cases
//    private final Trip sedanTrip = new Trip(VehicleType.SEDAN, 30, 40, 3);
//    private final Trip bikeTrip = new Trip(VehicleType.MOTOR_BIKE, 20, 20, 2);
//    private final Trip sevenSeaterTrip = new Trip(VehicleType.SEVEN_SEATER, 50, 40, 7);

// For the refactored Trip class with Polymorphism
    private final SedanTrip sedanTrip = new SedanTrip(VehicleType.SEDAN,30, 40, 3);
    private final MotorBikeTrip bikeTrip = new MotorBikeTrip(VehicleType.MOTOR_BIKE, 20, 20, 2);
    private final SevenSeaterTrip sevenSeaterTrip = new SevenSeaterTrip(VehicleType.SEVEN_SEATER, 50, 40, 7);


    // Test Cases for the perHeadFare() method
    @Test
    public void Sedan_perHeadFair_test(){
        int result = sedanTrip.perHeadFare();
        int expected = 340;

        Assert.assertEquals(expected,result);
    }

    @Test
    public void Bike_perHeadFair_test(){
        int result = bikeTrip.perHeadFare();
        int expected = 200;

        Assert.assertEquals(expected,result);
    }

    @Test
    public void SevenSeater_perHeadFair_test(){
        int result = sevenSeaterTrip.perHeadFare();
        int expected = 210;

        Assert.assertEquals(expected,result);
    }


    // Test Cases for the canTakeTrip() method
    @Test
    public void Sedan_canTakeTrip_test(){
        boolean result = sedanTrip.canTakeTrip();
        boolean expected = false;

        Assert.assertEquals(expected,result);
    }

    @Test
    public void Bike_canTakeTrip_test(){
        boolean result = bikeTrip.canTakeTrip();
        boolean expected = false;

        Assert.assertEquals(expected,result);
    }

    @Test
    public void SevenSeater_canTakeTrip_test(){
        boolean result = sevenSeaterTrip.canTakeTrip();
        boolean expected = true;

        Assert.assertEquals(expected,result);
    }
}

