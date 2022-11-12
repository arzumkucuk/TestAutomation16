package day09_IfStatement;

public class OddOrEven {

    public static void main(String[] args) {

        int number = 1000;

        boolean even = number % 2 == 0;
        boolean odd = !even;

        System.out.println(number+ " is even number: "+ even);
        System.out.println(number+ " is odd number: "+ odd);

        System.out.println("=====================================================");


        int  n= 200 ;
        boolean isPositive = n > 0;
        boolean isNegative = n < 0;
        boolean isZero = !isPositive && !isNegative;

        System.out.println(n+ " is positive: "+ isPositive);
        System.out.println(n+" is negative: "+ isNegative);
        System.out.println(n+ " is zero: "+ isZero);


        System.out.println("=====================================================");

        System.out.println( false == !true);
                        //  false == false ==> true

        System.out.println( false != true && !false == true);
                        //       true   && true ==> true

        System.out.println( !false != false || false );
                        //   true != false ==> true

        System.out.println( !false != false && false ); // false

        System.out.println( true && true &&true && false); // false

        System.out.println(false || false || false || false || true); // true

        // (!!!!false) = false











    }
}
