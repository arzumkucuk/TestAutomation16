package replit;

import java.util.Scanner;

public class R_31 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        for (int i=1; i<=3; i++){

            System.out.println("1) option 1");
            System.out.println("2) option 2");
            System.out.println("3) option 3");
            System.out.println("Select an option");
            int num = scan.nextInt();
            if (num==1) {
                System.out.println("User selected 1");
                break;
            }else if (num==2){
                System.out.println("User selected 2");
                break;
            } else if (num==3) {
                System.out.println("User selected 3");
                break;
            }
        }
    }
}
