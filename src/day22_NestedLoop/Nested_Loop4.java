package day22_NestedLoop;

public class Nested_Loop4 {

    public static void main(String[] args) {



        for (int j = 1; j<= 7; j++){

            for (int i=1; i<=j; i++){

                System.out.print("*");

            }
            System.out.println();
        }
        System.out.println("========================");

        for (int a = 7; a >= 1; a--){

            for (int i = 1; i <= a; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
