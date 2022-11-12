package day43_Inheritance.RestauranTask;

import day43_Inheritance.PersonTask.Employee;

public class Server extends Employee {

    public Server(String name, int age, char gender, double hourlyRate, String jobTitle, String ID) {
        setInfo(ID, name, age, gender, hourlyRate, jobTitle);
    }

    public void serving(){
        System.out.println(jobTitle+" "+name+ " is serving");
    }

    public void takeOrder(){
        System.out.println(jobTitle+" "+name +" is taking order");
    }

    public void cleanTable(){
        System.out.println(jobTitle+" "+name+" is cleaning table");
    }

}
