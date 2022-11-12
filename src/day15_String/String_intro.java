package day15_String;

import java.lang.String;
import java.util.Scanner;

public class String_intro {

    public static void main(String[] args) {

        String str ="Cybertek";  // import java.lang yazmadan string yazabiliriz. digerleri icin gecerli degil
      //  Scanner input = new Scanner(System.in);

        String name = "Cybertek"; // String literal
        String name2 = new String("Cybertek");

        String s1= "Cat"; // String literal
        String s2= "Cat"; // String literal
                          // java memory de 2 adet variable oluyor
    //              "Cat" == "Cat" ==> true
        System.out.println(s1==s2); //true

        String d1= "Dog"; // String literal
        String d2= "dog"; // String literal

        System.out.println(d1==d2); // false

        String t1 = new String("Tiger"); // heap
        String t2 = new String("Tiger"); // java memory de 2 adet variable oluyor // heap
        System.out.println(t1==t2); // false  -->> cunku 2 farkli variable
        //              new String("Tiger") == new String ("Tiger") ==> false, this one is not same

        System.out.println("================================================");

        String c1 = "Cybertek"; // String pool  (String ozel hafiza yeri)
        String c2 = new String("Cybertek"); // heap (Java ozel hafiza yeri)
        String c3 = new String("Cybertek"); // heap
        String c4 = "Cybertek"; // String pool
        String c5 = "cybertek"; // String pool

        System.out.println(c1==c2); // ==>  false
        //              "Cybertek" == new String ("Cybertek"); ==> false
        System.out.println(c2==c3);  // false
        // new String ("Cybertek") == new String ("Cybertek") ==> false

        System.out.println(c1==c4); // ==> true

        System.out.println(c4 == c5);
        //          "Cybertek" == "cybertek" ==> false

        System.out.println("=======================================");

        String str1= "Java";
        str1 = "JavaScript";

        System.out.println(str1); // JavaScript

        str1 ="Java";

        System.out.println(str1); // Java















    }

}
