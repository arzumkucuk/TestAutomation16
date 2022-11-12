package Odevler;

public class nestedStar {
    public static void main(String[] args) {

        for (int i=1; i<7; i++){

            for (int j=0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i=7; i>0; i--){

            for (int t = 0; t<i; t++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
