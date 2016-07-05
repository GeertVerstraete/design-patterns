/**
 * Created by aryastark on 05/07/16.
 */
public class VehicleFactory {


    Car createCar(String color, String fuelType) {

       return new Car(
               "audi",
               "A3",
               "black",
               1600,
               "leather Black",
               false,
               false,
               "diesel",
               1
       );
   }
}
