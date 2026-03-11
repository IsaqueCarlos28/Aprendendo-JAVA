package java_essential_training_Objects_and_apis.tutorials.inheritance;
// SUBCLASS
/* To create an INHERITANCE relation we use the word "extends" and the name of the class extended on
    the header of the SUBCLASS */
//Its possible to OVERRIDE and OVERLOAD the methods of the SUPERCLASS
public class ChildClass extends ParentClass {
    private String field3;
    private String field4;

    /*implicitly calls the default constructor of the SUPERCLASS,if it doesn't exist then the constructor
    brakes, and it's needed to call another constructor explicitly*/
    public ChildClass() {
        /*"super()" with no name calls the constructor by default, by setting the parameters you
        identify the others constructors by its signature*/
        //The calling of the parent constructor using supper mus come before the other params
        super("NOME", "IDADE");
        System.out.println("default constructor in ChildClass class");
    }
        //super("NOME","IDADE"); -
    public ChildClass(String field1,String field2,String field3,String field4){
        super(field1, field2);
        setField3(field3);
        setField4(field4);
        System.out.println("second constructor in ChildClass class");
    }

    public String getField3() {
        return field3;
    }
    public void setField3(String field3) {
        this.field3 = field3;
    }

    public String getField4() {
        return field4;
    }
    public void setField4(String field4) {
        this.field4 = field4;
    }

    //OVERRIDE - MAINTAINS THE SIGNATURE AND CHANGE THE BODY
    // Overriding the method to show the fields of both parent and child class
    @Override /*Its encouraged to use the annotation Overrid since it warns Java the intention of
    overriding the method inherited by the superclass*/
    //It's not possible to change the access modifier to something stricter = public <- protected <- private
    public void showField() {
        /* It wasn't needed to declare field1 and field2 two because they were inherited since
           they were protected and not private*/
        System.out.println(field1 + ", " + field2 + ", " + field3 + ", " + field4);
    }

    //OVERLOAD - MAINTAIN THE NAME BUT CHANGE THE PARAMS AND THE BODY
    //Overloading the method to print a specific field
    public void showField(String field){
            System.out.println(field);

    }
}
