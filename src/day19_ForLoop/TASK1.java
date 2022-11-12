package day19_ForLoop;

public class TASK1 {
    public static void main(String[] args) {
        // odd and even number print with continue statement

        for (int i=1; i<=50; i++){

             if (i%2==0){
                 continue;
             }
            System.out.print(i+" ");
        }
    }
}
