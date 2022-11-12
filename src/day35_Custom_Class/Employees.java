package day35_Custom_Class;

import java.util.ArrayList;

public class Employees {

    public String name;
    public char gender;
    public String SSN;
    public String ID;
    public String jobTitles;
    public String company;
    public double salary;

    public void setInfoEmployeer(String emName, char emGen, String emSSN, String emID, String emJobTitle, String emCompany
                                , double emSalary){
        name=emName;
        gender=emGen;
        SSN =emSSN;
        ID = emID;
        jobTitles = emJobTitle;
        salary=emSalary;

    }
    public void getInfo(){
        System.out.println(name+", "+gender+", SSN: "+SSN+", ID: "+ID+", JobTitle: "+jobTitles+", Salary: $"+salary);
    }



}
