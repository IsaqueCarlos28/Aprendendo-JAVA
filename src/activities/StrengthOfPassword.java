package activities;
import java.util.Scanner;

public class StrengthOfPassword{

    // Current credentials
    static final String USERNAME = "jane_doe";
    static final String CURRENT_PASSWORD = "passw0rd";

    public static void main(String[] args){
        System.out.println("""
                Choose your new password,it must:
                - Be at least 8 characters long;
                - Contain a UPPERCASE letter;
                - Contain an special character;
                - Not contain the username;
                - Not be the same as the current password;
                """);
        Scanner scanner = new Scanner(System.in);
        String newPassword;
        boolean isPasswordValid;
        do{
            newPassword = scanner.nextLine();
            isPasswordValid = validatePassword(newPassword);
            if (!isPasswordValid){
            System.out.println("\nTry again");
            }
        }while(!isPasswordValid);
            System.out.print("You changed your password");
            scanner.close();
    }

    static boolean validatePassword(String newPassword) {
        boolean isPasswordValid = true;
        StringBuilder passwordStatus = new StringBuilder();
        if (newPassword.length() < 8){
            passwordStatus.append("\nYour password must be at least 8 characters long");
            isPasswordValid = false;
        }
        if (newPassword.equals(newPassword.toLowerCase())){
            passwordStatus.append("\nYour password must contain at least one UpperCase letter");
            isPasswordValid = false;
        }
        if (newPassword.matches("[a-zA-Z0-9]*")) {
            passwordStatus.append("\nYour password must contain at least one special character");
            isPasswordValid = false;
        }
        if (newPassword.contains(USERNAME)){
            passwordStatus.append("\nYour password must not contain the username");
            isPasswordValid = false;
        }
        if (newPassword.equals(CURRENT_PASSWORD)){
            passwordStatus.append("\nYour password must not be the same as the current password");
            isPasswordValid = false;
        }

        if(!isPasswordValid){
            System.out.println(passwordStatus);
        }
        return isPasswordValid;
    }
}
