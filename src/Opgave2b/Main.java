package Opgave2b;

import java.util.ArrayList;

public class Main {
    public String getItem(ArrayList<String> items, int index) {
        if(index < 0 || index >= items.size()){
            throw new IllegalArgumentException(
                    "Indeks " + index + " er uden for range 0-" + (items.size() - 1));
        }
        return items.get(index);
    }

    public static void main(String[] args){
        ArrayList<String> items = new ArrayList<>();
        items.add("Expresso");
        items.add("Latte");
        items.add("Cola");

        Main m = new Main();

        // Gyligt index
        try{
            System.out.println(m.getItem(items, 3));
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        // Ugyldige index
        try{
            System.out.println(m.getItem(items, 2));
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }
}
