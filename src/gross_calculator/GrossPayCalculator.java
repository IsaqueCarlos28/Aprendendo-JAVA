package gross_calculator;


import java.util.Locale;
import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] args){
        //Setting the numeric format to us(because I'm from Brazil)
        Locale.setDefault(Locale.US);

        int hours = 0;
        double payRate = 0;
        //initializing the scanner
        Scanner scanner = new Scanner(System.in);

        //changing the value of the variable for a input made by the user
        System.out.println("how many hours did you work?");
        hours = scanner.nextInt();

        System.out.println("what is your pay rate?");
        payRate = scanner.nextDouble();

        //Ending the Scanner
        scanner.close();

        double result = hours * payRate;
        System.out.println("Month payment: " + result);
    }
}
