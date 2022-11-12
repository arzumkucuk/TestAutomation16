package day39_StaticBlock;

import day37_CustomClass.Employee;

public class HumanResource {

    public static Employee employee1;
    public static Employee employee2;
    public static Employee employee3;
    public static Employee employee4;
    public static Employee employee5;

    static {

        employee1 = new Employee();
        employee2 = new Employee();
        employee3 = new Employee();
        employee4 = new Employee();
        employee5 = new Employee();

        employee1.setInfo("Ayse", "Bank Of America", "QA","ABC123", 'F',45,55);
        employee2.setInfo("Arzum", "Bank Of America", "QA","A012", 'F',45,55);
        employee3.setInfo("Sevgi", "Bank Of Azerbaijan", "QA","AB412", 'F',45,55);
        employee4.setInfo("Hakan", "Amazon", "SDET","B123", 'M',45,55);
        employee5.setInfo("Eren", "Apple", "SDET","C1234", 'M',45,55);


    }




}
