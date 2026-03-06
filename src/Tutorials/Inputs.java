package Tutorials;

import java.util.Locale;
//importation of the java.util package witch contains the Scanner class
import java.util.Scanner;

public class Inputs {
    public static void main(String[] args){
        /*Setting the numeric format to us,needed for Scanner since I'm from Brazil,
        but it's a good thing to do*/
        Locale.setDefault(Locale.US);

        //initializing the variable with a default value of 0
        int input = 0;

        //Scanner type of input based on a class from an external package
        //initializing the scanner
        Scanner scanner = new Scanner(System.in);

        //changing the value of the variable for an input made by the user
        System.out.println("choose a value");
        input = scanner.nextInt();

        //Ending the Scanner
        scanner.close();

        //showing the new value
        System.out.println(input);

    }
}
