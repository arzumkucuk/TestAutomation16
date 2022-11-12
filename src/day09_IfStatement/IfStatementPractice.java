package day09_IfStatement;

public class IfStatementPractice {
    public static void main(String[] args) {

        String name = "David";
        int age = 20;
        boolean isUSCitizen = false;

        boolean eligible =isUSCitizen && age >=18;
        //                  false && true ==> false

        if (eligible){
            System.out.println(name+ " is eligible to vote");
        }

        if (!eligible){
            System.out.println(name+" name is not eligible to vote");
        }

        System.out.println("=========================================================");

        int num1 = 20;
        int num2 = 20;
        boolean maxNum=num2>num1;

        if (maxNum){
            System.out.println(num2+" is the max number");
        }
        if (num1==num2){
            System.out.println("both number are equal");
        }
        if (num1<num2){
            System.out.println(num1+" is the min number");
        }

        System.out.println("==========================================");

        int b = 2;
        boolean res = ++b == 2 || --b == 2 && --b == 2;
                   //  3 == 2 || 2 == 2 && 1 == 2
        //              false \\ true && false
        //              false

        System.out.println(res);


        System.out.println("==========================================");

        boolean x = true, z= true;
        int y = 20;
        x= (y!=10)||(z=false);
        //  true || false
        // true
        System.out.println(x);









    }
}
