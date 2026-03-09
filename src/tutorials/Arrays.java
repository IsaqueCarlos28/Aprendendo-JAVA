package tutorials;

public class Arrays {
    public static void main(String[] args){
    //ARRAYS
    //  Are data types that function as a container for various values of the same type
    //  An array is declared by brackets("[]") after the type or the name
    //  String[] arrayName = new String[6]
    //  String arrayName[] = new String[6];
    //  The number inside the type indicates how many values the array will storage
    //  The quantity of space of the array is fixed, so it can't lengthen to hold more values
        String[] names = new String[5];
        names[0] = "Zhao";
        names[1] = "Zuko";
        names[2] = "Long Fang";
        names[3] = "Azula";
        names[4] = "Ozai";

    /* If the values of the array are already know, it's possible to create an array with
    the length of the values quantity of values*/
        String[] names2 = {"Amon","Unalaq","Zaheer","Kuvira"};

    //The values of an Array are accessed by the index of its position in the array
        System.out.println(names[0] + " and "+names2[0]+
                " Are the first villains of each series of Avatar");
    }
}
