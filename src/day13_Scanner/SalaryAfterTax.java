package day13_Scanner;
/*
annual salary
state tax
federal tax
write to use SCANNER
 */
import java.util.Scanner;

public class SalaryAfterTax {
    public static void main(String[] args) {

        Scanner tax= new Scanner(System.in);
        System.out.println("Enter your salary:");
        double salary = tax.nextDouble();
        
        System.out.println("Enter your state tax rate:");
        double stateTaxRate= tax.nextDouble();
        double stateTax = salary*stateTaxRate;

        System.out.println("Enter your federal tax rate:");
        double federalTaxRate = tax.nextDouble();
        double federalTax = salary*federalTaxRate;

        double salaryAfterTax= salary - stateTax - federalTax;


        System.out.println("Your annual salary is: $ " + salary);
        System.out.println("Your state tax is: $" + stateTax);
        System.out.println("Your federal tax is: $"+ federalTax);
        System.out.println("Your salary after tax: $"+ salaryAfterTax);








    }


}
