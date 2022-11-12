package day43_Inheritance.PersonTask;

public class Employee extends Person {

    public double hourlyRate;
    public String jobTitle, ID;

    public void setInfo(String ID, String name, int age, char gender, double hourlyRate, String jobTitle) {
        setInfo(name, gender, age);
        this.ID = ID;
        this.jobTitle = jobTitle;
        this.hourlyRate = hourlyRate;
    }

    public double calcSalary(){
        return hourlyRate * 40 * 52;
    }

    public void work(){
        System.out.println(name+ " is working");
    }

    public String toString() {
        return "Employee{" +
                "name= '" + name + '\'' +
                ", age= " + age +
                ", hourlyRate= $" + hourlyRate +
                ", jobTitle= '" + jobTitle + '\'' +
                ", ID= '" + ID + '\'' +
                ", gender= " + gender +
                ", salary= $" + calcSalary() +
                '}';
    }

    public static String publicVariable ="Public";

    protected static String protectedVariable = "Proctected";

    static String dafultVariable = "default";


}
