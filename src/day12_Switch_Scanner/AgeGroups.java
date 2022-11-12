package day12_Switch_Scanner;

public class AgeGroups {
    public static void main(String[] args) {

        int age =15;

        String result="";

        if (age>0 && age <=150){

            if (age<21){
                result="Teenager";
            }else if(age >= 21 && age <= 55 ){
                result="Adult";
            }else{
                result="Senior";
            }

        }else{
            result="Invalid number";
        }
        System.out.println(result);

    }
}
