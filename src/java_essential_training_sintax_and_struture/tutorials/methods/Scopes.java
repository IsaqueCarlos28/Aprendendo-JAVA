package java_essential_training_sintax_and_struture.tutorials.methods;

public class Scopes {
    //SCOPES
    /* the scope of a variable is defined by brackets("{}") they are within,
    being divided by LOCAL and GLOBAL variables */
    //GLOBAL - variables declared outside of methods, visible for all the methods
    //LOCAL - variables declared within a method, visible only inside the method
    //If,for,while and others are also considered as methods because of the brackets("{}")

    String myVariable = "global variable"; // Creating a global variable

    public void returnVariables(){
        String myVariable = "Local Variable";
        /*"this" is a reserved word used to specify a
        global variable or one from a bigger scope*/
        System.out.println(myVariable + " " + this.myVariable);
    }

}
