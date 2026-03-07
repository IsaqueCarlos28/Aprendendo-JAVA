package activities;

import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class HeadsOrTailsGame {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        while(true){
            //player input
            System.out.println("Choose heads: 1 or tails: 2");
            int playerChoice = scanner.nextInt();
            if (playerChoice != 1 && playerChoice != 2){
                System.out.println("Choose a valid option: Heads -> 1 OR Tails -> 2");
                playerChoice = scanner.nextInt();
            }

            //run game
            System.out.println("The coin is tossed ...");
            Random random = new Random();
            int headOrTail = random.nextInt(2) + 1;

            //Show result to player
            String resultGame = switch (headOrTail){
              case 1 -> "Heads!";
              case 2 -> "Tails!";
              default -> "Error!";
            };
            if (headOrTail == playerChoice){
                System.out.println(resultGame + " Congratulations you won");
            }else{
                System.out.println(resultGame + " You lost");
            }

            //play again
            //clears the scanner because I used int last time
            scanner.nextLine();
            System.out.println("Do you wanna play again? -> YES: Y or NO: N");
            String playAgain = scanner.nextLine();
            //verify if the strings are valid
            if (!playAgain.equalsIgnoreCase("Y") && !playAgain.equalsIgnoreCase("N")){
                System.out.println("Choose a valid option: -> YES: Y or NO: N");
                playAgain = scanner.nextLine();
            }

            if (playAgain.equalsIgnoreCase("N")) break;
        }
    }
}
