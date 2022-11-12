package day43_Inheritance.PersonTask;

public class Person {

    public String name;
    public char gender;
    public int age;


    public void setInfo (String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;

    }

    public void eat(){
        System.out.println(name+" is eating");
    }

    public  void sleep(){
        System.out.println(name+" is sleeping");
    }


    public String toString() {
        return "Person{" +
                "name= '" + name + '\'' +
                ", gender= " + gender +
                ", age= " + age +
                '}';
    }
}

/*
Person
    name, age, gender
    setInfo, eat(), sleep(), work()

 Employee extends Person
    name, age, gender, hourlyRate, jobTitle, ID
    setInfo, eat(), sleep(), work(),

 Tester extends Employee
    name, age, gender, hourlyRate, jobTitle, ID
    Constructor
    eat(), sleep(), work(), testing()...

  Developer extends Employee
    name, age, gender, hourlyRate, jobtitle, ID
    Constructor
    eat(), sleep(), work(), code()...

 */
