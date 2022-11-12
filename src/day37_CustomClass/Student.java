package day37_CustomClass;

import java.time.LocalDate;

public class Student {

    public String name, ID;
    public LocalDate DOfB;
    public int age;
    public char gender;
    public double gpa;

    public void setInfo(String name, char gender, LocalDate DOfB, String ID, double gpa){
        this.name = name;
        this.gender = gender;
        this.DOfB = DOfB;
        this.ID = ID;
        this.gpa = gpa;
        age = LocalDate.now().getYear() - DOfB.getYear();


    }

    public void getInfo(){
        System.out.println("Student Name: "+name+"\nID: "+ID+ "\nDOfB: "+DOfB+ "\nGender:"+gender+"\ngpa: "+gpa);
    }


    public String toString() {
        return
                "{Student name= " + name +
                ", ID='" + ID  +
                ", DOfB=" + DOfB +
                ", age=" + age +
                ", gender=" + gender +
                ", gpa=" + gpa +" }\n";
    }
}

/*
1. Student :
            Attiributes:
                        names, age, gender, ID
            Action:
                    setInfo, getInfo, study
 */