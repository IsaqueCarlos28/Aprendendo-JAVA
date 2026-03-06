package activities;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args){
        //initializing know values
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        //Get values for the unknown
        System.out.println("How many sales did the employee make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Decision
        if(sales >= quota*2){
            salary = salary + (bonus*2);
            System.out.println("Congratulations, you past the double the quota, you receive 2x the bonus");
        }else if(sales >= quota){
            salary = salary + bonus;
            System.out.println("Congratulations, you reached the quota");
        }else{
            int salesShort = quota - sales;
            System.out.println("Unfortunately you missed the " +
                    "quota by " + salesShort + " sales");
        }

        //output
        System.out.println("The employee's payment is $" + salary);
    }
}
