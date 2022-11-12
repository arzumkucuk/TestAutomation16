package day43_Inheritance.PersonTask;

public class Developer extends Employee { // developer IS A person, Developer IS A Employee

    public static String jobTitle;

    static {
        jobTitle = "Developer";
    }

    public Developer(String name, String ID, double hourlyRate, int age, char gender) {
        setInfo(ID,name,age,gender,hourlyRate,jobTitle);

    }

    public void code(){
        System.out.println(jobTitle+" "+name+ " is coding");
    }


}
