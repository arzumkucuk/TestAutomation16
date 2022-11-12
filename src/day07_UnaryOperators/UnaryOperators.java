package day07_UnaryOperators;

public class UnaryOperators {

    public static void main(String[] args) {

        int a = 100; // 0 is not positive or negative
        boolean isPositive = a > 0; // verify if a is positive
        boolean isNegative = a < 0; // verify if a is negative
        boolean isZero = a==0;

        System.out.println(a+ " is positive number: "+ isPositive);
        System.out.println(a + " is negative number: "+ isNegative);
        System.out.println(a + " is Zero: "+ isZero);

        int b = -100 - 20; // -120
        System.out.println(b);

        int c = 10 - -20; // +
              // 10 + 20 = 30

        int d = -10 * 4; // -40
        int e = 10 * -4; // -40
        int f = -10 * -4; // 40

        System.out.println("================================================");

        int x = 100;
        ++x; // 101  increases the value by1, 100+1= 101 (increment)

        System.out.println(x);

        int y = 100;
        --y; // 99 decreases the value by 1, 100 - 1 =99 (decrement)

        System.out.println(y);

        int z = 100;
        System.out.println(--z);

        int x2 = 100;
        System.out.println(++x2); //101

        System.out.println("=========================================");
        // POST:

        int a2 = 100;

        System.out.println(a2++); // 100
        System.out.println(a2); // 101

        int b2 = 100;
        System.out.println(--b2); // 99
        System.out.println( b2--); // 100 //  bir sonra ki out yaptigimizda sayi 1 eksilecek.
        System.out.println(b2); // 99












    }
}
