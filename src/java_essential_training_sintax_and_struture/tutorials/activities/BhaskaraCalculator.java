package java_essential_training_sintax_and_struture.tutorials.activities;

import java.util.Locale;
import java.util.Scanner;

public class BhaskaraCalculator {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        //Getting the values
        System.out.println("Bhaskara calculator");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the value of A:");
        int valueA = scanner.nextInt();
        System.out.println("Write the value of B:");
        int valueB = scanner.nextInt();
        System.out.println("Write the value of C:");
        int valueC = scanner.nextInt();

        //Calculating delta
        double deltaValue = calculateDelta(valueA,valueB,valueC);
        //calculating the roots
        String rootValues = calculateRoot(deltaValue,valueA,valueB,valueC);

        //Outputting the result
        System.out.println(rootValues);
    }

    public static double calculateDelta(int a, int b,int c){
        //there is no exponentiation in java, so it's used this method from Math class
        return (Math.pow(b,2)) - 4 * a * c;
    }

    public static String calculateRoot(double delta,int a,int b,int c) {
        String result;
        if (delta == 0) {
            result = "not a quadratic operation";
        } else if (delta < 0) {
            result = "no real roots";
        }else {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            result = "root1 = " + root1 + " & root2 = " + root2;
        }
        return result;
    }
}
