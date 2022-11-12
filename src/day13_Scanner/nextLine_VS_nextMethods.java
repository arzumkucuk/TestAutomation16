package day13_Scanner;

import java.util.Scanner;

public class nextLine_VS_nextMethods {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // 120000 enter yap
        System.out.println("Enter your salary;");
        double salary = scan.nextDouble();

        scan.nextLine(); // we use this to take out the Enters that are left in the scanner. so that we can use the nextLine
                        // Enter anlamina gelir. eger bunu yazmazsan alttaki nextline enter olarak okunur. yazmak zorundayiz
                         //  sayili variable kodlarda araya bunu eklemek gerekir.

        System.out.println("Enter your full name;");
        String fullName = scan.nextLine();

        System.out.println("Salary: "+ salary);
        System.out.println("full name: "+ fullName);

    }
}
