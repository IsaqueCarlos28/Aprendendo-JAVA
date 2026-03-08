package tutorials;

//OBJECTS
// - are structures that contain data in the form of fields(variables) and methods
// - that data can be utilized in other classes by creating an object
// - encapsulation (OOP) says that the fields must be private but the methods public
public class Objects {
    //fields
    private int field1;
    private int field2;

    //CONSTRUCTORS
    //They are used to initialize the fields of an object or set it state
    //All object have constructors
    //All the constructors have the same name of the class, differed by the parameters

    //DEFAULT constructor - witch is set by default even if not explicit
    //Doesn't have parameters
    //Used to provide default values
    public Objects(){

    }
    public Objects(int value1, int value2){
        setField1(value1);
        setField2(value2);
    }

    /*GETs and SETTERs are methods to make available to assign
     numbers in the fields of this class*/
    //Get - Return the value of the fields
    public int getField1(){
        return field1;
    }
    public int getField2(){
        return field2;
    }

    //SET - assign the value of the fields
    public void setField1(int field1){
        this.field1 = field1;
    }
    public void setField2(int field2){
        this.field2 = field2;
    }

    //Methods of the class that can be used by other classes
    public int sumFields(){
        return field1 + field2;
    }
    public void showFields(){
        System.out.println("Field1 = " + field1 + "  && Field2 = " + field2);
    }
}
