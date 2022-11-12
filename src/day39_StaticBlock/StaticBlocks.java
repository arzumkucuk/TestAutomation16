package day39_StaticBlock;

import day37_CustomClass.Employee;

public class StaticBlocks {

    public static String company;
    public static Employee employee1;
    public static int b;
    public static boolean isEmployed;


    // xcelSheet


    static {
        company = "Capital One";
        isEmployed = true;
        employee1 = new Employee();
        employee1.setInfo("Arzum",company,"SDET","A123",'F',40,8);

        // a = 100;
        b = 200;
        System.out.println("Static Block");

        }



    /*
    public static void main(String[] args) {

        company = "Bank Of America";
        employee1 = new Employee();
        employee1.setInfo("John", company,"SDET","A123",'M',40,9);
        b = 200;
        isEmployed = true;

        System.out.println(company);
        System.out.println(employee1);
        System.out.println(b);
        System.out.println(isEmployed);

        // bu sekilde yazarsak Test class ta hepsi null veriyor.




    }

     */






}
