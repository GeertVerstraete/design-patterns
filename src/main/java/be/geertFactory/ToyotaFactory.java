package be.geertFactory;

/**
 * Created by KVRRQ70 on 5/07/2016.
 */
class ToyotaFactory implements VehicleFactory {
    @Override
    public Car createCar(Car.Color color, String model) {
        return new ToyotaCar(color, model);
    }

    @Override
    public Truck createTruck(int capacity) {
        return new ToyotaTruck(capacity);
    }
}
