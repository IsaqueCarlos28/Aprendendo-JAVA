package activities;

import java.util.Scanner;

public class SchoolGradeProgram {
    public static void main(String[] args){
        char grade = 'X';

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the student's score:");
        byte score = scanner.nextByte();
        scanner.close();

        if(score < 60){
            grade = 'E';
        } else if (score < 70) {
            grade = 'D';
        } else if (score < 80) {
            grade = 'C';
        } else if (score < 90){
            grade = 'B';
        }else{
            grade = 'A';
        }

        String message = switch (grade){
            case 'A' -> "Excellent Job!";
            case 'B' -> "Good Job!";
            case 'C' -> "Regular";
            case 'D'-> "Good look next time";
            case 'E'-> "Study more";
            default -> "error, input a valid grade";
        };
    }
}
