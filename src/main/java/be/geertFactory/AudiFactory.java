package be.geertFactory;

/**
 * Created by KVRRQ70 on 5/07/2016.
 */
class AudiFactory implements VehicleFactory {
    @Override
    public Car createCar(Car.Color color, String model) {
        return new AudiCar(color, model);
    }

    @Override
    public Truck createTruck(int capacity) {
        return new AudiTruck(capacity);
    }
}
