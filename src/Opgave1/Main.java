package Opgave1;

import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int number = promptNumber("Skriv et tal:");
        System.out.println("Du skrev: " + number);
    }


    public static int promptNumber(String msg) {
        System.out.println(msg);
        try {
            return Integer.parseInt(scan.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Skriv tal");
            return promptNumber(msg);
        }
    }

}

