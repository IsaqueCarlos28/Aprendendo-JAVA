package tutorials.loops_and_decisions;

public class RepetitionStructures {
    public static void main(String[] args){
        //WHILE LOOP
        //Loops a code while a condition is true
        /*the condition is tested before the loop is started,
        witch means the loop can never run*/
        int x = 1;
        while (x <= 10){
            System.out.println(x + " - Condition True");
            x = x + 1;//the variable is updated to prevent a infinite loop
        }

        // DO WHILE LOOP
        //Loops a code while a condition is true
        /*the condition is tested after the loop is started,
        witch means the loop will run at least once*/
        int y = 1;
        do {
            System.out.println("the loop is run");
        }while(y < 1);

        // DO WHILE LOOP
        /*the loop is controlled by a count with a defined number of times or until
        conditional max number is met*/
        for (int i = 1;i <= 10;i++){
            System.out.println("counting: " + i);
        }

        //BREAK LOOP
        //To exit a loop even if the condition is still true, use the reserved word "break"
    }
}
