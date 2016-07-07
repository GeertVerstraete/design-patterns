package be.geertChocolate;

/**
 * Created by aryastark on 05/07/16.
 */
public class ChocolateBoiler {
    private static ChocolateBoiler uniqueInstance;

    private ChocolateBoiler() {
    }

    public static ChocolateBoiler getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new ChocolateBoiler();
        }
        return uniqueInstance;
    }
}

