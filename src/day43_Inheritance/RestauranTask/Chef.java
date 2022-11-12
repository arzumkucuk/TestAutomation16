package day43_Inheritance.RestauranTask;

import day43_Inheritance.PersonTask.Employee;

public class Chef extends Employee { // Chef IS An employee, Chef IS A person

    public Chef(String name, int age, char gender, double hourlyRate, String jobTitle, String ID ){
        setInfo(ID, name, age, gender, hourlyRate, jobTitle);
    }


    public void makeOrder(){
        System.out.println(jobTitle+" "+ name+ " is making order");
    }

    public void cooking(){
        System.out.println(jobTitle+" "+ name+" is cooking");
    }



}
