package day36_CustomClass;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employees {

    public String name, ID, jobTitle, companyName ;
    public char gender;
    public double salary;
    public LocalDate hireDate;

    public void setInfoEmplys(String name, char gender, String ID, String jobTitle, String companyName,
                              double salary, LocalDate hireDate){

        this.name=name; // instance = local
        this.gender=gender;
        this.ID=ID;
        this.jobTitle=jobTitle;
        this.companyName=companyName;
        this.salary=salary;
        this.hireDate=hireDate;

    }

    public void getInfo(){
        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMM-dd-yyyy");
        DecimalFormat decimal = new DecimalFormat("0.00");

        System.out.println("Name: "+name+", "+gender+", ID: "+ID+", JobTitle: "+jobTitle+", CompanyName: "+companyName+
                ", Salary: $"+decimal.format(salary)+", Hire Date: "+hireDate.format(df));
    }

    public void attendMeeting(){

    }
    public void working(){
        System.out.println(name+" is working");

    }

}
