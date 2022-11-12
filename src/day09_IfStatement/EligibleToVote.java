package day09_IfStatement;

public class EligibleToVote {
    public static void main(String[] args) {
         //ex
         String name = "James";
         int age =19;
         boolean eligibleAlcohol = age >= 21;

        System.out.println(name+ " is eligible to buy Alcohol?\n\t"+ eligibleAlcohol);

        System.out.println();

        String names= "John";
        String citizenShip = "USA";
        boolean eligibleVote = citizenShip == "USA" ;

        System.out.println(names + " is eligible to vote for Donald Trump or Joe Biden? \n\t"+eligibleVote );



    }
}
