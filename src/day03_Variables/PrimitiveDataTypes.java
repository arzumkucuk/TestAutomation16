package day03_Variables;

public class PrimitiveDataTypes {

    public static void main(String[] args) {
        // score is 85
         byte score = 85;
         int score2 = 40;

        System.out.println(score);
        System.out.println(score2);
        System.out.println("score"); // text message on in double quote


        long number0 = 9999999999L;
        // int is prefered, compiler takes it as an int, and the number 9999999999 is out of int' range
        // program her zaman sayilari int olarak algilar ve long sayilarin sonuna l harfi koymak long olarak algila anlamina gelmek.

        long number1 = 9999999999l;

        double decimal1 = 0.5;
        // float float1 =  0.5; // double is prefered for decimals, compiler takes it as, double' range is greater than float
        float float2 = 0.5f;
        System.out.println(float2); //0.5

        /*
             for integers : int
             for decimal : double
         */












    }


}
