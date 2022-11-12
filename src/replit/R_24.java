package replit;

import java.util.Scanner;

public class R_24 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = scan.next();
        System.out.println("Enter your last name");
        String lastName=scan.next();
        System.out.println("Enter your email");
        String email=scan.next();
        scan.nextLine();
        System.out.println("Enter your street");
        String street = scan.nextLine();
        System.out.println("Enter your city");
        String city = scan.next();
        System.out.println("Enter your state");
        String state = scan.next();
        System.out.println("Enter your zipcode");
        int zipcode= scan.nextInt();
        System.out.println("Enter your work phone number");
        long workPhone=scan.nextLong();
        System.out.println("Enter your personel number");
        long personelNum = scan.nextLong();
        System.out.println("Enter your age");
        int age = scan.nextInt();
        System.out.println("Enter your height");
        double height =scan.nextDouble();
        System.out.println("Enter your weight");
        double weight = scan.nextDouble();

        String fullName="Full name: "+firstName+", "+lastName;
        String contacs = "Work phone number: "+workPhone + ", Personel phone number: "+ personelNum+ ", Email: "+email;
        String address = street+", "+city+","+state+","+zipcode;
        System.out.println("Patient personal information");
        System.out.println(fullName);
        System.out.println(address);
        System.out.println(contacs);


    }
}
