package day41_Encapsulation;

import static day41_Encapsulation.Data.*;

public class Data {

    public static String publicVariable = "A";
    private static String privateVariable = "B";
    static String defaultVariable = "C"; // default accsess

    // protected static String protectedVariable ="D";


    // public: her paket ve classa cagirilabilir
    // private: sadece kendi classinda kullanilabnilir hic bir paket ve pakete tasinmaz
    // default: ayni pakette classlar arasi kullanilir, farkli pakete tasinmaz

    Data(){

    }

    public static void publicMethod(){
        System.out.println("public method");
    }
    private static void  privateMethod(){
        System.out.println("private meethod");
    }
    static void DefaultMethod(){
        System.out.println("Default method");
    }




}
