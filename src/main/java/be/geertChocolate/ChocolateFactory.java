package be.geertChocolate;

/**
 * Created by aryastark on 05/07/16.
 */
public class ChocolateFactory {
    public static void main(String[] args) {
        ChocolateBoiler warmte = ChocolateBoiler.getInstance();
        ChocolateBoiler nietwarmte = ChocolateBoiler.getInstance();
        if (warmte == nietwarmte) {
            System.out.println("lol");
        }

    }
}
