package java_essential_training_sintax_and_struture.tutorials.loops_and_decisions;

import java.util.Locale;
import java.util.Scanner;

public class DecisionStructures {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        //IF ,ELSE IF, ELSE
        System.out.println("Choose a path = 1,2 or 3");
        Scanner scanner = new Scanner(System.in);
        byte path = scanner.nextByte();

        //creates a condition that if true executes de code within
        if(path == 1){
            System.out.println("first path");
        }
        /*if the first condition isn't met then the code executes de second
        one, and keeps going until there is no conditions left*/
        else if (path == 2) {
            System.out.println("Other paths");
        }else if (path == 3){
            System.out.println("Other paths");
        }
        /* when none of the conditions are met is possible to set what happens
        in that case */
        else{
            System.out.println("last path");
        }

        //SWITCH CASE
        /* Switch is a form of decision by comparison, there is two forms os using switches*/
        scanner.nextLine();
        System.out.println("Choose the option = A,B or C");
        //scanner = new Scanner(System.in);
        String userChoice = scanner.nextLine();

        //switch statements
        String optionVisualisation1;
        //compares the value of the variable with the options
        switch (userChoice){
            case "A": //set an option, a case
                optionVisualisation1 = "1 - you choose option A"; //the algorithm that is run
                break; /*End this code, so break-thru doesn't happen, but it can use break-thru
                sometimes, like when you wanna repeat code for two different options*/
            case "B":
                optionVisualisation1 = "1 - you choose option B";
                break;
            case "C":
                optionVisualisation1 = "1 - you choose option C";
                break;
            default: // is run as default when the other options aren't chose
                optionVisualisation1 = "1 - You didn't choose any option ";
                break;
        }

        //switch expressions
        //more simple, can be addressed as a value for a variable
        String optionVisualisation2 = switch (userChoice) {
            case "A","a" -> "2 - you choose option A"; // doesnt allow break-thru
            case "B","b" -> "2 - you choose option B"; //can have more then one option for the same code
            case "C","c" -> "2 -you choose option C";
            default -> "2 - You didn't choose any option";
        };

        System.out.println(optionVisualisation1 + optionVisualisation2);
    }
}
