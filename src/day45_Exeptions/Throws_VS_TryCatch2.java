package day45_Exeptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws_VS_TryCatch2 {

    public static void method1() throws FileNotFoundException { // throws metodu gecici cozum, baska bir methodda hata verir

        FileInputStream file = new FileInputStream("");
    }

    public static void method2() throws FileNotFoundException {
        method1();
    }

    public static void method3(){ // try& catch tamamen handle etmis olursun ve bir daha her hangi bir methodda hata vermez
        try {
            method2();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void method4(){
        method3();
    }
}
