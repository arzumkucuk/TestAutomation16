package replit;

import java.util.Scanner;

public class R_23 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter area code");
        int areaCode = scan.nextInt();
        System.out.println("Enter local number");
        int localNum = scan.nextInt();

        String phoneNum= "("+areaCode+")-"+ localNum;
        System.out.println("Calling number is: "+ phoneNum);
    }
}
