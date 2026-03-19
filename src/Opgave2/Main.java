package Opgave2;

public class Main {
    public static void main(String[] args) {
        try {
            Drink drink = new Drink();
            drink.setPrice(-3.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Ugyldig: " + e.getMessage());
        }
    }
}
