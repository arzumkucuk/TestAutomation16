package day11_NestedIf_Switch;

public class NumberToWords {
    public static void main(String[] args) {

        // 1. write a java prog that can convert numbers between 0-9 to words, if the number is greater than 9 or
        // less than zero out put should be "invalid".

        int num = 6;

        String result="";

        if (num==0){
            result = "zero";
        }else if (num == 1){
            result = "one";
        } else if (num == 2) {
            result= "two";
        }else if (num==3){
            result="three";
        }else if(num==4){
            result="for";
        }else if (num==5){
            result="five";
        }else if (num==6){
            result="six";
        }else  if (num==7){
            result="seven";
        }else if (num==8){
            result="eight";
        }else if (num==9){
            result="nine";
        }else{   //(num < 0 || num > 9){
            result="Invalid";
        }
        System.out.println(result);


    }
}
