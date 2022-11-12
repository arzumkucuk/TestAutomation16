package day09_IfStatement;

public class MaximumMinimum {
    public static void main(String[] args) {

        int n1 = 400;
        int n2 = 200;

        boolean n1IsMax = n1 > n2;
        boolean n2IsMax = n2 > n1;
        boolean equal = !n1IsMax && !n2IsMax;
                         // n1 == n2;

        if (n1IsMax) {
            System.out.println(n1 + " is maximum");
        }

        if (n2IsMax) {
            System.out.println(n2 + " is maximum");
        }

        if (equal) {
                System.out.println(" both are equal");
        }

        boolean n1IsMin = n1 < n2;
        boolean n2IsMin = n2 < n1;

        if (n1IsMin) {
                System.out.println(n1 + " is minimum");
        }
        if (n2IsMin) {
                System.out.println(n2 + " is minimum");
        }

        System.out.println("=================================================");

        /*
        1. write a java program that accepts three numbers and return the maximum number
        ( assume that none of them are equal
         */

        double a = 500;
        double b = 200;
        double c= 1000;

        boolean aIsMax = a > b && a > c;  // && yerine || kullanirsan sonucun dogru cikmaz. && her iki durum dogru olmasi sart
        boolean bIsMax = b > a && b > c;
        boolean cIsMax = c > a && c > b;
        //               !aIsmax && !bIsMax seklinde yazabiliriz

        double max = 0; // we want to assign the maximum number to variable max

        if (aIsMax){
            // System.out.println(a + " is max number");
            max = a;
        }

        if (bIsMax){
            // System.out.println(b + " is max number");
            max = b;
        }

        if (cIsMax){
            // System.out.println(c + " is max number");
            max = c;

        }

        System.out.println(max+ " is maximum number");

        System.out.println("======================================");

        int x=300;
        int y=400;
        int z=10;

        boolean xIsMin= x < y && x < z;
        boolean yIsMin= y < x && y < z;
        boolean zIsMin= z < x && z < y;

        int min = 0;

        if (xIsMin){
            min = x;
        }
        if (yIsMin){
            min=y;
        }
        if (zIsMin){
            min=z;
        }
        System.out.println(min+ " is minimum number");








        }





    }