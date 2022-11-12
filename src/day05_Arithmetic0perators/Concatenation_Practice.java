package day05_Arithmetic0perators;

public class Concatenation_Practice {
    public static void main(String[] args) {

        int houseNumber = 7925;
        String streetName = "Johns Branch Dr";
        String cityName = "McLean";
        String state = "VA";
        int zipCode = 22000;

        System.out.println("I live at " + houseNumber + " house number in "+cityName+" , "+state);
        System.out.println("My zipcode is: "+ zipCode+ "!");

        System.out.println("==============================================");

        String brand= " Toyata";
        String model = " Camry";
        int year = 2010;
        int mileage = 55000;
        double price= 22000;
        String color = " Red";

        System.out.println(year + brand+ model+", " + mileage +" miles,"+color+ ", "+"$18000" );

        System.out.println("==================================================");

        String firstName= "Arzum ";
        String lastName = "Kucuk";
        String fullName = firstName + lastName;
        int age = 26;
        char geneder = 'F';
        long phoneNumber = 8083511830l;
        int ssn= 1234567;

        System.out.println("full name is: "+ fullName);
        System.out.println("age is: "+ age+ " years old.");
        System.out.println("gender is: "+ geneder);
        System.out.println("phone number is: "+ phoneNumber);
        System.out.println("ssn is: "+ ssn);

        System.out.println("==================================================");

        double salary = 100000.50;
        double stateTaxRate= 0.50;
        double federalTaxRate = 0.8;
        double totalTax= 15000;
        double federalTax = 8000;
        double stateTax = 1500;
        double salaryAfterTax= 87500;

        System.out.println("Your salary is: "+ salary);
        System.out.println("Your state tax is: "+stateTax);
        System.out.println("Your federal tax is: "+ federalTax);
        System.out.println("Your total tax is: " + totalTax);
        System.out.println("Your salary after tax is: "+ salaryAfterTax);


    }
}
