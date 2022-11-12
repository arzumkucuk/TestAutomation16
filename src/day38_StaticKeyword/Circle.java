package day38_StaticKeyword;

import java.text.DecimalFormat;

public class Circle {

    /*
    warmup:

        1. create a custom class called Circle
            Attributes:
                radius, diameter, area, perimeter

            Methods:
                calculateArea: returns the area of the circle
                calculatePerimeter: returns the perimeter of the circle
                to String methods

        2. Create a custom class called SalaryCalculator

            Attributes:
                hourlyRate, weeklyHours, stateTax, federalTax, salary, salaryAfterTax

            Methods:
                calculateSalary: returns the annual salary
                calculateStateTax: returns the annual salary
                calculateFederalTax: returns the total tax
                calculateSalaryAfterTax: returns the salary the salary after calculate
                setInfo: accepts four arguments (hourlyRate, weeklyHours, stateTax, federalTax) and initialize all instances

                to String() method

     */

    public double radius, diameter, area, perimeter;

    public void setInfo(double radius){
        this.radius = radius;
        diameter = 2 * radius;
        area = calculateArea();
        perimeter = calculatePerimeter();
    }

    public double calculateArea(){
       // DecimalFormat df = new DecimalFormat("0.00");
        // double area = radius * radius * Math.PI;
        return radius * radius * Math.PI;
        //return Double.parseDouble(df.format(area) );
    }
    public double calculatePerimeter(){
        return diameter * Math.PI;
    }

    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");

        return "Circle {" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", area="+ df.format(area) +
                ", perimeter=" + df.format(perimeter) +
                '}';
    }

    public boolean equals (Circle circle){
        return this.radius == circle.radius;
    }
}
