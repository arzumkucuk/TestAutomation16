package Odevler;

public class javacilar {

    public static void main(String[] args) {

        String word = "javacilar";
        char ch = 'a';

        int count = 0;

        String sum= "";

        for (int i = word.length()-1; i>=0; i--){

            char str =word.charAt(i);
            if (ch == str){
                count++;
            }
        }
        System.out.println(count);
    }
}
