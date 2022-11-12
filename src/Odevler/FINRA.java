package Odevler;

public class FINRA {

    public static void main(String[] args) {

       // int num = 100;
        String result="";

        for (int i=1; i <= 100; i++){

            if (i % 15 == 0){
                result="FINRA ";
            }else if (i % 5 == 0){
                result="RA ";
            }else if (i%3==0){
                result="FIN ";
            }else {
                result= (i+" ");
            }
            System.out.print(result);
        }

    }
}
