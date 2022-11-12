package day35_Custom_Class;

import day36_CustomClass.Employees;

import java.util.ArrayList;
import java.util.Arrays;

public class Employees2 {

public String name, company,ID;
public int age;
public double salary;

public void employee(String name, String company, String ID,int age, double salary){

    this.name=name;
    this.company=company;
    this.ID=ID;
    this.age=age;
    this.salary=salary;
}

public void getInfo(){
    System.out.println(name+" "+company+" "+ID+" "+age+" "+salary);
}

    public static void main(String[] args) {

        Employees2[] emplys = {new Employees2(), new Employees2(), new Employees2()}   ;


        emplys[0].employee("Arzum", "Google","123", 28, 125000);
        emplys[1].employee("Eren", "facebook", "145", 33, 145000);
        emplys[2].employee("Ruhi", "tesla", "258", 21, 122000);

        /*
        for (Employees2 each : emplys){
            each.getInfo();
        }

         */

        ArrayList<Employees2> employees2s = new ArrayList<>(Arrays.asList(emplys));

        employees2s.removeIf(p-> p.salary<145000);

        for (Employees2 each : employees2s){
            each.getInfo();
        }

        ArrayList<Employees2> employeess = new ArrayList<>(Arrays.asList(emplys));

        employeess.removeIf(p->p.company.equalsIgnoreCase("google"));

        for (Employees2 each : employeess){
            System.out.println(each.name+" : "+each.company);
        }


    }
}
