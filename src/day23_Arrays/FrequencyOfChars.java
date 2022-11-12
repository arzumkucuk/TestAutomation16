package day23_Arrays;

public class FrequencyOfChars {
    /*
     write a program that can return the frequency of every single characters from string :

        ex: str1: "aabbccaa";
        output: a4b2c2

        HINT:
                easier approch:
                1, remove dublicates -> str2 => "abc"
                2. then find each of str 'character' frequency in str1 => 4, 2, 2
                3. result: a4b2c2

     */

    public static void main(String[] args) {

        String str  = "ABAB"; // "A2B2"
        String nonDup = "";   // "AB"
        String result ="";  // "A2B2"


        // 2. yol



        for (int i=0; i<=str.length()-1; i++){
            String ch =""+ str.charAt(i); // A, B, A, B

            if (!nonDup.contains(ch)){
                nonDup += ch;
            }
        }

        System.out.println(nonDup);

        // str = "ABAB"    nonDup = "AB"

        for (int j=0; j<=nonDup.length()-1; j++) {

            char ch = nonDup.charAt(0); // A
            int count = 0;
            for (int i = 0; i <= str.length() - 1; i++) {
                if (str.charAt(i) == ch) {
                    count++;
                }
            }
            result += ""+ch + count;
        }
        System.out.println(result);




        char ch2 = nonDup.charAt(1); // A
        int count2 = 0;
        for (int i =0 ; i <= str.length()-1; i++){
            if (str.charAt(i) == ch2){
                count2++;
            }
        }

        result += ""+nonDup.charAt(1) + count2;

        System.out.println(result);




    }
}
