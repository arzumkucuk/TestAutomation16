package day11_NestedIf_Switch;

public class Ternary_Practice2 {

    public static void main(String[] args) {
//      ? means if, : else

        int num = 100;
        String result = "";

        if (num > 0){
            result = "Positive";

        }else if(num < 0){
            result = "Negative";

        }else{
            result = "Zero";
        }
        System.out.println(result);

        String result2 = (num > 0) ? "Positive" : (num < 0) ? "Negative" : "zero";
        System.out.println(result2);

        System.out.println("================================");
        /*
        write a program that can compare two number

            a = 10,  b = 20
            output: b is greater

            a = 30, b= 10;
            out put : a is greater

            a = 20, b =20;
            output : a is equal to b
         */


        int a = 10;
        int b = 20;
        String greater=(a>b) ? "a is greater" : (b>a) ? "b is greater" : "equal";
        System.out.println(greater);





    }
}
