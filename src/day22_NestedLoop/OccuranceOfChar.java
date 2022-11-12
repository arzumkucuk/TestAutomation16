package day22_NestedLoop;

public class OccuranceOfChar {

    public static void main(String[] args) {



        String str = "AABAAAAC";
        char ch = 'A';

        int count = 0;
        for (int i=0; i <=str.length()-1; i++ ){
            char each = str.charAt(i);
            if (each==ch){
                count++;

            }

        }
        System.out.println(count);


    }
}
