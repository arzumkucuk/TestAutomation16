package day08_ShortHand_Relational;

public class IdentifyNumber {
    public static void main(String[] args) {

        /*
        number = 200

        output :
               200 is positive number: true
               200 is negative number: false
               200 is zero: false

         */

        int number= 200;
        boolean b1=number > 0;
        boolean b2= number < 0;
        boolean b3 = number == 0;

        System.out.println(number+ " is positive number: "+ b1);
        System.out.println(number+ " is negative number: "+ b2);
        System.out.println(number+ " is zero: "+ b3);

        System.out.println("======================================");

        int angle1=30;
        int angle2=30;
        int angle3=90;


        boolean isValid = angle1 + angle2 + angle3 == 180;


        System.out.println("The triangle is valid "+isValid);
    }
}
