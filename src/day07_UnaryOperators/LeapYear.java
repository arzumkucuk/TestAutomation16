package day07_UnaryOperators;

public class LeapYear {
    public static void main(String[] args) {
/*
    Leap Year: 4 e tam bolunen yillara soylenir.
 */
        // Ex:

        int year= 2020;
        boolean leapYear = year%4 == 0;
        System.out.println(year+" is leap year : "+ leapYear);

        int yil=2021;
        int kalan1 = yil%4;
        boolean leapyear2=kalan1 <1;
        System.out.println(yil+ " is leap year: "+ leapyear2);

        System.out.println("======================================");

        int num = 65;
        boolean isDivisible2= num%2== 0;
        boolean isDivisible3 = num%3 == 0;
        boolean isDivisible5 = num%5==0;

        System.out.println(num + " is divisible by 2:"+ isDivisible2);
        System.out.println( num + " is divisible by 3:"+ isDivisible3);
        System.out.println(num + " is divisible by 5:"+ isDivisible5);


    }
}
