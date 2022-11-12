package day12_Switch_Scanner;

public class BiggerNumber {

    public static void main(String[] args) {

        double n1 =10;
        double n2 =200;
        double n3 =3050;

        boolean n1IsBigger = n1 > n2 && n1 > n3;

        boolean n2IsBigger = n1IsBigger == false && n2 >n3;
                            // n2 > n1 && n2 > n3;

        /*
        String result ="";

        if (n1IsBigger) {
            result = "n1 is bigger";
        }else if (n2IsBigger){
            result="n2 is bigger";
        }else {
            result="n3 is bigger";
        }
 */
       String result2 = (n1IsBigger) ? "n1 is bigger" : (n2IsBigger) ? "n2 is bigger" : "n3 is bigger";

        System.out.println(result2);





    }
}
