package day38_StaticKeyword;

public class CybertekStudent {

    public String name;
    public  int age, groupNumber;
    public char gender;

    public static String schoolName = "Cybertek School";
    public static boolean isOnlineStudent = true ;

    public void setInfo(String name, int age, int groupNumber, char gender) {
        this.name = name;
        this.age = age;
        this.groupNumber = groupNumber;
        this.gender = gender;
    }

    // static method da intance variable kullanilmaz, STATIC ONLY accepts static members
    // sadece public void de instance variable kullanilabilir

    public void study(){
        System.out.println(name+" is studying Java");
    }

    public static void getSchoolInfo(){
        System.out.println("School Name is: "+ schoolName);
    }


    public String toString() {
        return "CybertekStudent {" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", groupNumber=" + groupNumber +
                ", gender=" + gender +
                ", isOnline: "+ isOnlineStudent+
                ", School is: "+ schoolName+
                '}';
    }
}
/*
CybertekStudent
			instance: name, age, groupNumber, gender
			static: 	schoolName
 */