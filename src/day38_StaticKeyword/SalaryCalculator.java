package day38_StaticKeyword;

public class SalaryCalculator {

    public double hourlyRate, weeklyHours, stateTaxRate, federalTaxRate, salary, salaryAfterTax;

    public void setInfo(double hourlyRate, double weeklyHours, double stateTaxRate, double federalTaxRate) {
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        this.stateTaxRate = (stateTaxRate > 1)? stateTaxRate / 100 : stateTaxRate; // 8 will be 0.08
        this.federalTaxRate = (federalTaxRate > 1) ? federalTaxRate /100 : federalTaxRate;
        this.salary = calculateSalary();
        this.salaryAfterTax = calculateSalaryAfterTax();
    }


    public double calculateSalary(){
        return  hourlyRate * weeklyHours * 52;
    }

    public double calculateStateTax(){
        return salary * salaryAfterTax;
    }

    public double calculateFederalTax(){
        return salary * federalTaxRate;
    }

    public double calculateTotalTax(){
        return calculateStateTax() + calculateFederalTax();
    }

    public double calculateSalaryAfterTax(){
        return salary - calculateTotalTax();
    }

    public String toString() {
        return "SalaryCalculator {" +
                "hourlyRate=" + hourlyRate +
                ", salary=" + salary +
                ", salaryAfterTax=" + salaryAfterTax +
                '}';
    }

    public boolean equals(SalaryCalculator s1){
        return this.salary == s1.salary;
    }
}
