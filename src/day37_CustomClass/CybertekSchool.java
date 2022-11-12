package day37_CustomClass;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class CybertekSchool {

    public static void main(String[] args) {

        Student student1= new Student();
        Student student2= new Student();
        Student student3= new Student();
        Student student4= new Student();
        Student student5= new Student();
        Student student6= new Student();
        Student student7= new Student();
        Student student8= new Student();
        Student student9= new Student();
        Student student10= new Student();

        student1.setInfo("Aaron",'M', LocalDate.of(2000,11,2), "A01", 3.5);
        student2.setInfo("Daniel",'M',LocalDate.of(1990,10,25),"B123", 4.0);
        student3.setInfo("Mary", 'F',LocalDate.of(1991,8,5),"C113", 3.7);
        student4.setInfo("Eren", 'M',LocalDate.of(1989,6,1),"D005", 3.9);
        student5.setInfo("Arzum", 'F',LocalDate.of(1995,6,5),"F113", 3.5);
        student6.setInfo("Sevgi", 'F',LocalDate.of(1994,7,29),"H113", 2.7);
        student7.setInfo("Sulu", 'M',LocalDate.of(1985,12,5),"C13", 1.9);
        student8.setInfo("Asu", 'F',LocalDate.of(1990,4,20),"G002", 3.1);
        student9.setInfo("Ruhi", 'M',LocalDate.of(1998,10,23),"F006", 2.5);
        student10.setInfo("Derin", 'M',LocalDate.of(2001,1,19),"A010", 4.3);

        ArrayList<Student> cybertekStudents = new ArrayList<>();
        cybertekStudents.addAll(Arrays.asList( student1,student2,student3,student4,student5,student6,student7,student8,
                student9,student10));

        Student student11 = new Student();
        student11.setInfo("Mike", 'M',LocalDate.of(1990,9,19),"D123", 2.8);
        Student student12 = new Student();
        student12.setInfo("Lily", 'F',LocalDate.of(1992,5,10),"A678", 4.4);

        cybertekStudents.addAll(Arrays.asList(student11,student12));

        System.out.println(cybertekStudents);

        System.out.println("==============================================================");

        LocalDate youngest = cybertekStudents.get(0).DOfB; // 2001
        LocalDate oldest = cybertekStudents.get(0).DOfB;

        Student youngestStudent = null; //  null: is deafult value of all non primitives
        Student oldestStudent = null;

        for (Student each : cybertekStudents){
            if (each.DOfB.isAfter(youngest) ){ // whichever students Date of Birth is after the current youngest student
                youngest = each.DOfB;
                youngestStudent = each;
            }

            if (each.DOfB.isBefore(youngest)){
                oldest = each.DOfB;
                oldestStudent = each;
            }
        }
        System.out.println(youngest+" : "+ youngestStudent);
        System.out.println(oldest+" : "+ oldestStudent);

        System.out.println("============================================================");

        double highestGPA = cybertekStudents.get(0).gpa;
        double lowestGPA = cybertekStudents.get(0).gpa;


        for (Student eachStudent : cybertekStudents){
            double eachGPA = eachStudent.gpa;
            highestGPA = Math.max(eachGPA,highestGPA);
            lowestGPA = Math.min(eachGPA,lowestGPA);
        }

        System.out.println("Highest GPA: "+highestGPA);
        System.out.println("Lowest GPA: "+lowestGPA);


        System.out.println("=========================================================");

        ArrayList<Student> femaleStudens = new ArrayList<>(cybertekStudents);
        femaleStudens.removeIf(p->p.gender == 'M' ); // removes the students from femaleStudents list if the student 'M'

        System.out.println(femaleStudens);

        ArrayList<Student> maleStudens = new ArrayList<>(cybertekStudents);
        maleStudens.removeIf(p->p.gender == 'F');

        System.out.println(maleStudens);

        System.out.println("Total number of male students: "+maleStudens.size());
        System.out.println("Total number of female students: "+femaleStudens.size());



    }
}
