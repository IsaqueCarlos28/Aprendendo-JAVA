package java_essential_training_Objects_and_apis.tutorials.inheritance;

public class ParentClass {
    protected String field1;
    protected String field2;

    public ParentClass(){
        System.out.println("default constructor in ParentClass class");
    }

    public ParentClass(String field1,String field2){
        setField1(field1);
        setField2(field2);
        System.out.println("second constructor in ParentClass class");
    }

    public String getField1() {
        return field1;
    }
    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return field2;
    }
    public void setField2(String field2) {
        this.field2 = field2;
    }

    //Base Method for Overriding and Overloading
    //Shows the fields of this class
    public void showField(){
        System.out.println(field1 + " " + field2);
    }
}
