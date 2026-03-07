package tutorials;

//OBJECTS
// - are structures that contain data in the form of fields(variables) and methods
// - that data can be utilized in other classes by creating an object
// - encapsulation (OOP) says that the fields must be private but the methods public
public class Objects {
    //fields
    private int field1;
    private int field2;

    /*GETs and SETTERs are methods to make available to assign
     numbers in the fields of this class*/
    public int getField1(){
        return field1;
    }
    public void setField1(int field1){
        this.field1 = field1;
    }

    public int getField2(){
        return field2;
    }
    public void setField2(int field2){
        this.field2 = field2;
    }

    //Methods of the class that can be used by other classes
    public int sumFields(){
        return field1 + field2;
    }
}
