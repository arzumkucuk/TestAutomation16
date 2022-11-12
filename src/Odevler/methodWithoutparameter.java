package Odevler;

public class methodWithoutparameter {
    public static void main(String[] args) {
        printOddnumto100();
        printEvenNumto100();
    }

    public static void printOddnumto100(){
        for (int i=1; i<=100; i++){
            if (i%2 != 0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void printEvenNumto100 (){
        for (int i=0; i<=100; i+=2){
            System.out.print(i+" ");
        }
    }
    public static void addElement (int[] arr, int num){

    }
}
