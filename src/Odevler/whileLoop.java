package Odevler;

public class whileLoop {

    public static void main(String[] args) {

        int i = 1;
        while (i<=10){
            System.out.println(i);
            i++;
        }

        int name = 1;
        while (name<=5){
            System.out.println("Arzum");
            name++;
        }

        int num = 0;
        int sum = 0;
        while (num<=50){
            sum+=num;
            num +=2;

        }
        System.out.println(sum);


    }
}
