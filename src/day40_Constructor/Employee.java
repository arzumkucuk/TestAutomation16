package day40_Constructor;

public class Employee {

    public String name, jobTitle, ID;
    public double salary;

    public Employee(String name){
        this.name = name;

    }

    public Employee(String name, String jobTitle) {
        this(name);
        this.jobTitle = jobTitle;
    }

    public Employee(String name, String jobTitle, String ID) {
        this(name, jobTitle);
        this.ID = ID;
    }

    public Employee(String name, String jobTitle, String ID, double salary) {
        this(name, jobTitle, ID);
        this.salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", ID='" + ID + '\'' +
                ", salary=" + salary +
                '}';
    }
}

/*

    1. class name: Employee
        instance variables; name, jobTitle of the employee

        1st constructor: initialze the name of the employee

        2d constructor: initilaze the name, jobTitle of the employee
                        (MUST apply constructor Call)

        3rd Cosntructor: initialize the name, jobTitle, ID of the employee

        4th Constructor: initialize all the instance of the employee
                        (MUST apply constructor Call )

        Instance methods:
            tostring()
 */
