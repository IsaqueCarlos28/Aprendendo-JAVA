package tutorials.objects;
//RECORDS
// They are type of objects designed to receive data once and don't change it
// They are commonly referred as POJOS - Plain Old Java Objects
// The fields are not instantiated, they are defined as parameters for the recorded
// So they only have ACCESS methods, that are set by default
// they can have methods, they are defined within the brackets("{}")
// See the instantiation in class "ObjectInstance"
public record Record(
        int field1,
        int field2,
        int field3
) {
    public int sumFields(){
        return field1 + field2 + field3;
    }

}
