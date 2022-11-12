package day38_StaticKeyword.ScrumTeam;

public class Tester {

    public String name, ID, jobtitle, companyName;
    public double salary;
    public char gender;

    public static boolean isHuman = true;
    public static boolean isCybertekStudent = true;

    public void setInfo (String name, String ID, String jobtitle, String companyName, double salary, char gender) {
        this.name = name;
        this.ID = ID;
        this.jobtitle = jobtitle;
        this.companyName = companyName;
        this.salary = salary;
        this.gender = gender;
    }

    public void smokeTesting(){ // eger static yazarsak yazdigimiz intstance variableleri cagiramayiz
        System.out.println(name+" is performing smoke testing.");
    }

    public void creatingTicket(){
        System.out.println(name+" is creating ticket");
    }

    public String toString() {
        return "Tester= {" +
                "name='" + name + '\'' +
                ", employeeID='" + ID + '\'' +
                ", jobtitle='" + jobtitle + '\'' +
                ", companyName='" + companyName + '\'' +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }
}


/*
    create a class called Tester
                    Attributes:
                       instance:     name, employeeID, JobTitle, Salary
                       statics:      isHuman, isCybertekStudent

                    Actions:
                            setInfo(), smokeTesting(), creatingTicket(), toString()

 */
