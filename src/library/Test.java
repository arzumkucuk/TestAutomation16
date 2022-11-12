package library;

import day41_Encapsulation.Data;
import day43_Inheritance.AccessModifiers;

import static day41_Encapsulation.Data.*;

public class Test extends AccessModifiers {

    public static void main(String[] args) {

        System.out.println(Data.publicVariable);
        //System.out.println(Data);

       // Data obj1 = new Data();

        publicMethod();
       // privateMethod();
       // DefaultMethod();

        Test.publicMethod();
        Test.protectedMethod();
        // Test.defaultMethod();



    }
}
