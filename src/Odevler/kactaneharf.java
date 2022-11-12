package Odevler;

public class kactaneharf {

    public static void main(String[] args) {

        String str= "AABBCDA";
        String ch = "A";

        int count =0;

        for (int i=0; i<=str.length()-1; i++){

            String s = ""+str.charAt(i);

            if (ch.equals(s)){
                count++;
            }
        }
        System.out.println(count);
    }
}
