package day39_StaticBlock;

public class CybertekStudent {

    public String name, gender;
    public int age;

    public static String schoolName, dreamJob;
    public static boolean hasReplIT, hasFlipGrid;

    static { // sadece 1 kez yazdirir fakat void altina yazarsan surekli yazdirir fazla koda gerek yok.
        schoolName="Cybertek School";
        dreamJob ="SDET";
        hasFlipGrid = true;
        hasReplIT = true;
    }

    public void setInfo(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String toString() {
        return "CybertekStudent {" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", School Name= "+schoolName+
                '}';
    }
}
