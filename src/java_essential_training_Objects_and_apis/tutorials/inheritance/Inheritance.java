package java_essential_training_Objects_and_apis.tutorials.inheritance;
/*INHERITANCE
    Is when one class becomes an extension of another class, inheriting the members of the extended class
    This allow classes to reuse data that already exists in another classes
    There are tWo parties involved in the inheritance:
       - SUPERCLASS - PARENT CLASS: The extended, offers its attributes to the child class
       - SUBCLASS - CHILD CLASS: The extension, receives the members and methods of the parent class,
         along with its own
    SUBCLASSES should be more SPECIFIC form of the SUPERCLASS
    A SUBCLASS can only inherit from only one SUPERCLASS, but the SUPERCLASS can also inherit from other classes,
    this way it's possible to create a chain of objects, structured in hierarchy
    See the class ChildClass to lear how to create an inheritance relation between classes
    INHERITANCE RULES:
      - Constructors can't be inherited;
      - Anything marked as private can't be inherited, only public and protected members;
      - Methods marked as modifier "final" can be inherited but not overridden, because it marks that
        it's the last instance of that method
*/
public class Inheritance {
    public static void main(String[] args) {
        ParentClass parent = new ParentClass("Field1","Field2");
        ChildClass child = new ChildClass();
        /*when we call the constructor of the child class the constructor of
         the parent class runs before */
        /*If we need to use another constructor then the default one from
         the parent class we need to specify explicitly - see on ChildClass */

        //OVERRIDING AND OVERLOADING
        ChildClass child2 = new ChildClass("NAME","AGE","COUNTRY","GENRE");
        //Base method from parent class
        parent.showField();
        //Overriding - see on ChildClass
        child2.showField();;
        //Overloading - see on ChildClass
        child2.showField(child2.field2);
    }
}

