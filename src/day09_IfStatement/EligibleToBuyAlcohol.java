package day09_IfStatement;

public class EligibleToBuyAlcohol {
    public static void main(String[] args) {


        int age = 20;

        boolean eligible = age >=21;

        if (eligible){

            System.out.println("You are eligible to buy alcohol");
        }
         if (!eligible){
             System.out.println("Go buy your milk");
         }

        System.out.println("========================================");

         boolean isBreakTime = false;

         if (isBreakTime){
             System.out.println("Time to take a break");
         }

         if (!isBreakTime){
             System.out.println("Let's continue the class");

         }

         int number = 100;
         if (number%2==0){
             System.out.println(number+" is even number");
         }
         if (!(number%2==0)){
             System.out.println( number+ " is odd number");
         }

         int n= 101;
         boolean isEven= n%2==0;
         if (isEven){
             System.out.println(n+ " is even number");
         }
         if (!isEven){
             System.out.println(n+ " is odd number");
         }
        System.out.println("=============================================");











    }
}
