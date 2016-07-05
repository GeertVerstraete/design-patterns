/**
 * Created by aryastark on 05/07/16.
 */
public class Car {
    private String brand;
    private String model;
    private String color;
    private int cc;
    private String seats;
    private boolean spoiler;
    private boolean berline;
    private String fuelType;
    private int fuelLevel;

    public Car(String brand, String model, String color, int cc, String seats, boolean spoiler, boolean berline, String fuelType, int fuelLevel) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.cc = cc;
        this.seats = seats;
        this.spoiler = spoiler;
        this.berline = berline;
        this.fuelType = fuelType;
        this.fuelLevel = fuelLevel;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public boolean isSpoiler() {
        return spoiler;
    }

    public void setSpoiler(boolean spoiler) {
        this.spoiler = spoiler;
    }

    public boolean isBerline() {
        return berline;
    }

    public void setBerline(boolean berline) {
        this.berline = berline;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }
}

