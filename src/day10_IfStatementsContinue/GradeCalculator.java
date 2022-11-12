package day10_IfStatementsContinue;

public class GradeCalculator {
    public static void main(String[] args) {

        int score = 145;

        if (score>0 && score<=100){

            if ( score >= 90 && score <= 100 ){
                System.out.println(score + "  is A ");

            }else if(score >= 80 && score <= 89) {
                System.out.println(score + " is B");

            }else if (score >= 70 && score <= 79 ){
                System.out.println(score + " is C");

            }else if (score >= 60 && score <=69){
                System.out.println(score+ " is D");

            }else{
                System.out.println(score+ " is F");
            }

        }else{
            System.out.println("invalid score");
        }




    }
}
