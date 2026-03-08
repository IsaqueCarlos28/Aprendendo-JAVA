package tutorials.variables;

public class Operators {
    public static void main(String[] args){

        //NUMERAL OPERATORS
        int adition = 1 + 1;
        int substraction = 2 - 1;
        int multiply = 3 * 3;
        int division = 4 / 2;
        int module = 5 % 2;

        System.out.println( "adition :" + adition);
        System.out.println( "substraction :" + substraction);
        System.out.println( "multiply :" + multiply);
        System.out.println( "division :" + division);
        System.out.println( "module :" + module);

        //RELATIONAL OPERATORS
        int value1 = 2;
        int value2 = 3;

        boolean isBigger = value1 > value2;
        boolean isBiggerOrEqual = value1 >= value2;
        boolean isSmaller = value1 < value2;
        boolean isSmallerOrEqual = value1 <= value2;
        boolean isEqual = value1 == value2;
        boolean isDifferent = value1 != value2;

        System.out.println(isBigger);
        System.out.println(isBiggerOrEqual);
        System.out.println(isSmaller);
        System.out.println(isSmallerOrEqual);
        System.out.println(isEqual);
        System.out.println(isDifferent);

        //LOGICAL OPERATORS
        // && -> AND - must conditions be equal
        if (isBigger == false && multiply == 9){
            System.out.println("both conditions are truth");
        }
        // || -> OR - one condition must be truth
        if (isBigger == true || adition == 2){
            System.out.println("both conditions are truth");
        }
        // ! -> NOT - negates the condition, so the condition must be false to be truth
        if (! isBigger == true){
            System.out.println("the condition must be false to be truth");
        }


    }
}
