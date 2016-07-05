/**
 * Created by aryastark on 05/07/16.
 */
public class CarRunner {
    public static void main(String[] args) {
        VehicleFactory f = new VehicleFactory();
        Car c = f.createCar("black", "diesel");
        Car d = f.createCar("red", "gas");
    }
}
