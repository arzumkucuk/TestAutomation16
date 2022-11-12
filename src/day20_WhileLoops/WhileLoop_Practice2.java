package day20_WhileLoops;

public class WhileLoop_Practice2 {

    public static void main(String[] args) {

        int i = 1;
         while (i<=5){
             System.out.println("Arzum");
             i++;
         }

         String str ="Cybertek School";
         //           01234567

        String result ="";

        int index = str.length()-1;
        while (index >= 0){

            result += str.charAt(index);

            index--;
        }
        System.out.println(result);
    }
}
