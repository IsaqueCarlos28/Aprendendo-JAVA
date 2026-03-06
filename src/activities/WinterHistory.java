package activities;

import java.util.Locale;
import java.util.Scanner;

public class WinterHistory {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        String adjective = "";
        String season = "";
        byte numberOfCups = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("create your history");
        System.out.println("how was the day");
        adjective = scanner.nextLine();
        System.out.println("on witch season");
        season = scanner.nextLine();
        System.out.println("how many cups of coffee did you take?");
        numberOfCups = scanner.nextByte();

        scanner.close();

        System.out.println("On a "
        + adjective
        + " "
        + season
        + " day, I drank a minimum of "
        + numberOfCups
        + " cups of coffee.");
    }
}
