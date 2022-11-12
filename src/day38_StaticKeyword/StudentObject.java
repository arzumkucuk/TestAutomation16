package day38_StaticKeyword;

public class StudentObject {

    public static void main(String[] args) {


        CybertekStudent student1 = new CybertekStudent();
        student1.setInfo("Ayse", 21, 5,'F');

        CybertekStudent student2 = new CybertekStudent();
        student2.setInfo("Arzum",27,1,'F');

        CybertekStudent student3 = new CybertekStudent();
        student3.setInfo("Eren", 33,1,'M');

       // System.out.println(student1.schoolName); // bu sekilde yazarsan sadece instance variablelari karsilastirir
      //  System.out.println(student2.schoolName);

        System.out.println(CybertekStudent.schoolName); // prefered, cybertek student classindaki tum her seyi karsilastirir

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        /*
        student1.getSchoolInfo();
        student2.getSchoolInfo();
        student3.getSchoolInfo(); tercih edilen yontem degil

         */

        CybertekStudent.getSchoolInfo(); // tercih edilen yontem bu

    }
}
