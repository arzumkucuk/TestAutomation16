package replit;

import java.util.Scanner;

public class R_29 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double version = scan.nextDouble();

        if (version==1.5){
            System.out.println("Cupcake");
        }else if (version==1.6){
            System.out.println("Donut");
        }else if (version==3.1){
            System.out.println("Honeycomb");
        }else if (version>=4.1 && version<= 4.31){
            System.out.println("Jellybean");
        }
    }
}
