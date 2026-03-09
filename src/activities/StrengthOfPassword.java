package activities;
import java.util.Scanner;

public class StrengthOfPassword {

    // Current credentials
    static String username = "jane_doe";
    static String currentPassword = "passw0rd";

    /*
     - 8 characters long
     - contains a UPPERCASE letter
     - contains an especial character
     - does not contain the username
     - is not the same password
     */

    public static void main(String[] args){
        System.out.println("""
                Choose your new password,it must:
                - Be at least 8 characters long;
                - Contain a UPPERCASE letter;
                - Contain an especial character;
                - Not contain the username;
                - Not be the same as the current password;
                """);
        Scanner scanner = new Scanner(System.in);

        String newPassword = scanner.nextLine();
        boolean isPasswordValid = validatePassword(newPassword);
        if (isPasswordValid){
            System.out.print("You changed your password");
        }else {
            System.out.print(
"Try again");
        }

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
            passwordStatus.append("\nYour password must contain at least one especial character");
            isPasswordValid = false;
        }
        if (newPassword.contains(username)){
            passwordStatus.append("\nYour password must not contain the username");
            isPasswordValid = false;
        }
        if (newPassword.equals(currentPassword)){
            passwordStatus.append("\nYour password must not be the same as the current password");
            isPasswordValid = false;
        }

        System.out.println(passwordStatus.toString());
        return isPasswordValid;
    }
}
