package activities.my_pets;

import java.util.Random;
import java.util.Scanner;

public class MyPets {
    public static void main(String[] args){
        Pet dog = createPet();
        Pet cat = createPet();
        Pet owl = createPet();

        System.out.println(dog.getName());
        cat.agePet(8);

        makePetsFight(dog,cat);
    }

    public static void makePetsFight(Pet pet1,Pet pet2){
        Random random = new Random();
        int resultFight = random.nextInt(2)+1;
        String resultMessage = switch (resultFight){
            case 1 -> pet1.getName() + " won the fight!";
            case 2 -> pet2.getName() + " won the fight!";
            default -> "The fight ended on a tie";
        };
        System.out.println(pet1.getName()+" and "+pet2.getName()+" fought, " + resultMessage);
    }

    public static Pet createPet(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Whats the name of your pet");
        String name = scanner.nextLine();
        System.out.println("Whats the age of your pet");
        int age = scanner.nextInt();
        scanner.nextLine();//clear the scanner
        System.out.println("What sound does your pet make");
        String sound = scanner.nextLine();

        return new Pet(name,age,sound);
    }
}

