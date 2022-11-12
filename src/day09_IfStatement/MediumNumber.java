package day09_IfStatement;

public class MediumNumber {

    public static void main(String[] args) {

        int a = 100;
        int b = 200;
        int c = 300;
        int med = 0;

        boolean aIsMed = (a > b && a < c) || (a > c && a < b);
        boolean bIsMed = (b > a && b < c) || (b < a && b > c);
        boolean cIsMed = (c > a && c < b) || (c < a && c > b); // !aIsmed && !bIsMed;  yazabilirsin

        if (aIsMed){
            med = a;
        }
        if (bIsMed){
            med = b;
        }
        if (cIsMed){
            med = c;
        }
        System.out.println(med+ " is medium number");


    }
}
