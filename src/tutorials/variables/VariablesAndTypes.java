package tutorials.variables;

public class VariablesAndTypes {
    public static void main (String[] args){
        //Variable is a memory location that stores data
        /*
        Java is a Static Typed programming language, witch means it
        expects that the variable types be declared before being assigned
        a value
        */
        /*
        RULES:
        - can't use space;
        - can't start with numbers;
        - can't use reserved words;
        - some special characters can be used, some not;
        CONVENTION: variable names must start with LOWERCASE and must use
        CAMELCASE
        */

        //Variables and it types:

        //INTEGRALS
        // byte | default: 0 | size: 8-bit
        byte b = 100 ;
        // short | default: 0 | size: 16-bit
        short s = 10000;
        // int | default: 0 | size: 32-bit
        int i = 100000;
        // long | default: 0L | size: 64-bit
        int l = 9999999;

        //FLOATING POINT
        // float | default: 0.0f | size: 32-bit | 7 decimal digits
        float f = 123.1234567f;
        // double | default: 0.0d | size: 64-bit | 16 decimal digits
        double d = 123.1234567890123456;

        //BOOLEAN
        // boolean | default: FALSE | size: 1-bit
        boolean bo = true;

        //CHARACTER
        // char | default: '\u0000' | size: 16-bit | only one character
        char c = 'c';

        /* Besides being a Static Typed language, it offers type inference for LOCAL VARIABLES
        using "var", where it defines the type of the variable based on its value, but in
        order to use it the value of the variable must be assigned at it's declaration */

        boolean isFalse = false;
        // ==
        var isTrue = true;

    }

}
