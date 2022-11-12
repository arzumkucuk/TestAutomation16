package day43_Inheritance.PersonTask;

public class Tester extends Employee {

    public static String jobTitle;

    static {
        jobTitle = "Software Tester";
    }

    public Tester(String name, String ID, double hourlyRate, int age, char gender){
        setInfo(ID, name, age, gender, hourlyRate,jobTitle);
    }

    public void testing(){
        System.out.println(jobTitle+" " +name+ " is testing");
    }


}
