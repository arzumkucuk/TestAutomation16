package Odevler;

public class VoidMethodEligible {

    public static void main(String[] args) {

        eligibileVote("arzum", "usa", 28, true);


    }

    public static void eligibileVote (String name, String citizinShip, int age, boolean isAlive){

        if (citizinShip.equalsIgnoreCase("USA") ){
            if (isAlive){
                if (age>=18){
                    System.out.println("You are eligible to vote");
                }else{
                    System.out.println("you must be least 18");
                }
            }else{
                System.out.println("You must be alive");
            }

        }else{
            System.out.println("You can must be Citizenship in USA");
        }
    }
}
