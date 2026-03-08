package activities.my_pets;

public class Pet {
    private String name;
    private int age;
    private String sound;

    public Pet(String name,int age,String sound){
        setName(name);
        setAge(age);
        setSound(sound);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getSound() {
        return sound;
    }
    public void setSound(String sound) {
        this.sound = sound;
    }

    public void agePet(int years){
        setAge( age + years);
        System.out.println("your pet "+getName()+" aged " + years + "now it has" + getAge());
    }
}
