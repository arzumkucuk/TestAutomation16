package day07_UnaryOperators;

public class PrimitiveCastings {
    public static void main(String[] args) {

        short a = 3000;
        long b = a ; //  implicit casting, automatically done
        //    = 3000L

       // int c = b ; // casting MUST be done manually
                    // b long sayi oldugu icin kendinden kucuk (int)  olmaz. buyuk sayi kucuge atanamaz.
        int d = a; // implicit casting, automatically done


        double d1= 200.5;
        int i1 = (int) d1; // 200

        System.out.println(i1);

        System.out.println("==============================================");

        long l1 = 100;
        short s1 = (short) l1; // explicit casting

        double d2 = 300;
        float f1 = (float) d2;
        // for windiws : holding Alt + hit Enter
        // for Mac : holding Option + hit Enter

        long l2 = 300; // implicit casting
                // 300L
        int i2 = (int) l2;
               // 300
        System.out.println("===================================================");

        short s2 = 400;
        byte b1 = (byte) s2; // -128 <= byte <= 127
        System.out.println(b1); // the value 400 is out Byte' range and casting does not change the limit of dataType


        long l3= 100;
        byte b2 = (byte) l3; // -128 <= byte <= 127

        System.out.println(b2);














    }
}
