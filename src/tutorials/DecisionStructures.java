package tutorials;

public class DecisionStructures {
    public static void main(String[] args){

        //IF ,ELSE IF, ELSE
        int score = 30;
        String grade = "none";

        //creates a condition that if true executes de code within
        if(score < 60){
            grade = "E";
        }
        /*if the first condition isn't met then the code executes de second
        one, and keeps going until there is no conditions left*/
        else if (score < 70) {
            grade = "D";
        } else if (score < 80) {
            grade = "C";
        }else if (score < 90){
            grade = "B";
        }
        /* when none of the conditions are met is possible to set what happens
        in that case */
        else{
            grade = "A";
        }

        //SWITCH CASE
    }
}
