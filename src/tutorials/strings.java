package tutorials;

public class strings {
    public static void main(String[] args){
    //STRINGS
    //  They are not primitive types or wrapper classes, they are OBJECTS
    //  They are objects that are sequences of characters

        //Classic string declaration
        String text = "abc";
        // ==
        /*creating an array of characters and initializing a new string object by
        sending it through the constructor*/
        char[] characters = {'a','b','c'};
        String text2 = new String(characters);


        //EXAMPLES OF STRING METHODS

        String text3 = "I love Java";
        String[] words = text3.split(" "); //Split the string based on a element(this case " ")
        int numberOfWords = words.length;
        //Allows to place placeholders within strings - %d is a placeholder for strings
        String message = String.format("your text has %d words",numberOfWords);
        //Return the CHAR of the position/index 1 in the array that composes the String
        System.out.print(text3.charAt(1));
        System.out.print(text.equals(text2));

        //TEXT BLOCKS
        // are useful to make complex texts that need more than one line
        System.out.println("""
                Example of text blocks
                Example of text blocks
                Example of text blocks
                """);

    }
}
