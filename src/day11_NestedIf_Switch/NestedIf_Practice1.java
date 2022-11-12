package day11_NestedIf_Switch;

public class NestedIf_Practice1 {

    /*
        Task 01:
         precondition  : minimum salary of 30k
                sub condition: minimum 2 years of job history
    */
    public static void main(String[] args) {

        double salary=30000;
        int jobHistory =5;

        if (salary>= 30000){

            if(jobHistory >= 2){
                System.out.println("You are qualified");
            }else { // jobhistory < 2
                System.out.println("You must have been on job at least 2 years");
            }


        }else{
            System.out.println("You MUST earn at least $30K");
        }



    }

}
