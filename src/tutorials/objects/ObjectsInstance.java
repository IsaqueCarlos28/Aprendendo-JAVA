package tutorials.objects;

import java.util.Scanner;

public class ObjectsInstance {

    public static void main(String[] args){

        //INSTANTIATING AND USING CLASS

        //this is how you create an instance of an object: Class name = new Constructor()
        //default constructor:
        Objects object1 = new Objects();
        //constructor with parameters:
        Objects object2 = new Objects(30,40);

        /*Then you can call its methods, like the get and setter for the instance
        with a default constructor, since its fields have no value*/
        object1.setField1(10);
        object1.setField2(20);

        object1.showFields();
        object2.showFields();

        object1.sumFields();
        object2.sumFields();
        System.out.println("Object1 sum: " + object1.sumFields() + " Object2 sum: " + object2.sumFields());

        //It's possible to use Objects as parameters to methods
        int sumOfAllObjects = sumEveryObject(object1,object2);
        System.out.println("Sum of all Objects = " + sumOfAllObjects);

        //It's possible to use objects as the return value of a method
        Objects object3 = getObject();
        object3.showFields();
    }
    // the Class of the objects are passed as types
    public static int sumEveryObject(Objects object1,Objects object2){
        return object1.sumFields() + object2.sumFields();
    }

    public static Objects getObject(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please assign the value of field 1");
        int field1 = scanner.nextInt();
        System.out.println("Please assign the value of field 2");
        int field2 = scanner.nextInt();
        scanner.close();
        //
        return new Objects(field1,field2);
    }
}
