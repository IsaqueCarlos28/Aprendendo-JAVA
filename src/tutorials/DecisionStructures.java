package tutorials;

import java.util.Scanner;

public class DecisionStructures {
    public static void main(String[] args){

        //IF ,ELSE IF, ELSE

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
    }
}
