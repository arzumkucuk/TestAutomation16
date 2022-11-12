package day24_Arrays;

import java.util.Arrays;

public class odev {

    public static void main(String[] args) {

        String s = "Guzel Hayallerin Gerceklesmesi Java Ile Baslar";
       // String[] arr = s.split("");
        int sum =0;
        for (int i=0; i<=s.length()-1; i++){
           // String ch = arr[i];
            String ch = ""+ s.charAt(i);
            if (ch.contains("s")){
                sum ++;
            }
        }
        System.out.println(sum);


    }
}
