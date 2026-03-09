package java_essential_training_sintax_and_struture.tutorials.methods;

public class Methods {

    // METHODS(functions) are pieces of code that perform specific tasks within class
    /* They are used to break complex codes into smaller pieces that
    facilitate de process of creating and reading an algorithm*/
    /*Examples of methods already used:
    Class -> method
    all -> Main method;
    Scanner -> nextLine(),nextInt...;
    String -> equalsIgnoreCase();
    Locale -> setDefault();
    System -> out.println()
    */

    /*The first line of the method is the HEADER

    The first word of the header is the ACESS MODIFIER(not required), it can be:
    - public: any code from any class can use this method
    - private: can only be accessed by the class it began
    - default/protected: can only be used from classes of the same package

    The second word of the header is the NON-ACESS MODIFIER, it can be:
    - static:
    - final:
    - abstract:
    - synchronized:

    not every method requires this modifiers

    The third word is the return type of the method
    if nothing returns the method indicate by using "void"

    The forth word is the name of the method
    CONVENTION:
    - it starts with lower case and uses CamelCase
    - the first word of the name is a verb

    Then, inside the parenthesis goes the parameters, separated by ","

    all methods have a signature that is composed by (name + parameters)
    the signature must be unique within a class,
    OVERLOAD - is a technic of using the methods with the
    same name with different para for methods that differ very slightly
    */
    public static int calculateSum(int x,int y) {
        return x + y;
    }

    //CALLING A METHOD
    //methods are only executed if called, except the main method
    public static void main(String[] args){
        int resultSum = calculateSum(10,20);
        System.out.println(resultSum);
        //this is how you pass an ARGS
        showValues(new int[]{0,1,2,3,4,5,6,7,8,9});
    }

    //VARIABLE PARAMETERS - VARARGS - ARGS
    /*  Variable parameter allows you to be a bit more arbitrary with the number of values
    you send as a param, it is an ARRAY*/
    //  A method can only have one Variable parameter
    //  If a method have other parameters too, then the Variable argument must be declared last
    public static void showValues(int... a) {
        for (int i = 0; i < a.length;i++){
            System.out.println(a[i]);
       }
    }
}
