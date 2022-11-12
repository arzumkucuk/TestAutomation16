package day40_Constructor;

import java.text.DecimalFormat;

public class SalaryCalculator {
    public static int numberOfWorkingDays, numberOfweeks;
    public double weeklyHours, hourlyRate, stateTaxRate, federalTaxRate, salary, salaryAfterTax, totalTax;

    static {
        numberOfWorkingDays = 5;
        numberOfweeks = 52;
    }
//                                                                      0.08                    0.2
    public SalaryCalculator(double weeklyHours, double hourlyRate, double stateTaxRate, double federalTaxRate) {

        if (stateTaxRate > 1) { // 0.08 degil de 8 verilirse mesela 100 e bolmek gerekiyor
            stateTaxRate /= 100;
        }

        if (federalTaxRate > 1){
            federalTaxRate /= 100;
        }

        this.weeklyHours = weeklyHours;
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.salary = salary;
        salary = weeklyHours * hourlyRate * numberOfweeks;
        totalTax = (stateTaxRate + federalTaxRate) * salary;
        salaryAfterTax = salary - totalTax;
    }

    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return "SalaryCalculator {" +
                "weeklyHours=" + weeklyHours +
                ", hourlyRate=" + hourlyRate +
                ", stateTaxRate=" + stateTaxRate +
                ", federalTaxRate=" + federalTaxRate +
                ", salary=" + salary +
                ", salaryAfterTax=" + salaryAfterTax +
                ", totalTax=" + df.format(totalTax) +
                '}';
    }

}
