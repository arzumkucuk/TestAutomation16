package day41_Encapsulation;

public class Test {

    public static void main(String[] args) {

        System.out.println(Data.publicVariable);
     //   System.out.println(Data.privateVariable); bu sekilde private olan cagirilmiyor yazsanda hatali
        System.out.println(Data.defaultVariable);

        Data obj = new Data();

        Data.publicMethod();
       // Data.privateMethod();
        Data.DefaultMethod();

    }
}

class Test2{

}

class Test3{

}