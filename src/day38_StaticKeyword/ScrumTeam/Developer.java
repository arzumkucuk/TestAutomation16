package day38_StaticKeyword.ScrumTeam;

public class Developer {

    public String name, ID, jobtitle, companyName;
    public double salary;
    public char gender;

    public static boolean hasCodingSkills = true;

    public void setInfo (String name, String ID, String jobtitle, String companyName, double salary, char gender) {
        this.name = name;
        this.ID = ID;
        this.jobtitle = jobtitle;
        this.companyName = companyName;
        this.salary = salary;
        this.gender = gender;
    }

    public void coding(){
        System.out.println(jobtitle+" "+name+" is coding");
    }
    public void fixingBug(){
        System.out.println(jobtitle+" "+name+" is fixing Bugs");
    }


    public String toString() {
        return "Developer= {" +
                "name='" + name + '\'' +
                ", employeeID='" + ID + '\'' +
                ", jobtitle='" + jobtitle + '\'' +
                ", companyName='" + companyName + '\'' +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }
}
