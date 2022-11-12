package day05_Arithmetic0perators;

public class EmployeeInfo {
    public static void main(String[] args) {

        String firtName= "John";
        String lastName="Daniel";
        char gender = 'M';
        int age = 35 ;
        String companyName = "CapitalOne";
        String jobTitle= "SDET";
        boolean isFullName= true;
        boolean isMarried= false;
        double salary=1200000.50;

        System.out.println("Employee' full name is : " + firtName + " " + lastName);
        System.out.println(firtName+" " + lastName+ "' gender is: " + gender);
        System.out.println("John Daniel' age is : " + age + " years old");
        System.out.println("John Daniel works at: " + companyName);
        System.out.println(firtName+" "+ lastName + "' Job title is: " + jobTitle);
        System.out.println(firtName + " " + lastName +"' salary is: " + salary +"$");
        System.out.println(firtName +" "+ lastName+ " is full time employee : " + isFullName);
        System.out.println(firtName +" "+  lastName +" is married : " + isMarried);



    }
}
