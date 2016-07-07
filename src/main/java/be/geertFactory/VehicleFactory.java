package be.geertFactory;

public interface VehicleFactory {
    Car createCar(Car.Color color, String model);
    Truck createTruck(int capacity);
}

