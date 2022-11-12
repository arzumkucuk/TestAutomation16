package day29_Methods;

public class MethodWithParameter {

    public static void main(String[] args) {

        int age = 35;
        eligibleToBuyAlcohol(age);

        eligibleToBuyAlcohol(30);

        calculateAge(1996, 2020);
        calculateAge(2022,1995);

    }

    public static void eligibleToBuyAlcohol (int age ){

        if (age >= 21){
            System.out.println("Eligible to buy alcohol");
        }else{
            System.out.println("Not Eligible to buy alcohol");
        }
    }

    public static void calculateAge (int birthYear, int currentYear){
        if (birthYear<currentYear){
            System.out.println("Your age is: "+ (currentYear-birthYear) + " years old");
        }else {
            System.out.println("Invalid Entry");
        }
    }


}
