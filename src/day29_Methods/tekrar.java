package day29_Methods;

public class tekrar {

    public static void main(String[] args) {
        //int age1 = 32;

        calculateAlcoholBuy(32);
        birthdayCalculate(2022,1995);

    }

    public static void calculateAlcoholBuy(int age) {
        if (age>=21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not eligible");
        }

    }
    public static void birthdayCalculate(int currentYear, int birthYear){
        if (birthYear<currentYear){
            System.out.println("Your age is: "+(currentYear-birthYear)+" years old");
        }else {
            System.out.println("invalid");
        }
    }
}
