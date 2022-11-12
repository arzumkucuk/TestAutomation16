package day30_ReturnMethods;

import library.StringUtility;

public class frequencyOfCharacter {

    public static void main(String[] args) {

        String str = "aaabbbbcc";
        String result = "";  // a3b4c2

         String nondup = StringUtility.removeDuplicates(str);   // a b c

        for (int i=0; i<= nondup.length()-1; i++) {
            char ch = nondup.charAt(i);   // a
            int count = StringUtility.frequency(str, ch);          // 3 4 2
            result += "" + ch + count;
        }
        System.out.println(result);

        System.out.println("=========================================");

        String str2 = "aaaaaaaaabbbbbbbbbbbccccccccdddddddddd";

        String result2 = frequencyIOfCharacters(str2);
        System.out.println(result2);
    }

    public static String frequencyIOfCharacters (String str) {

        String result = "";  // a3b4c2

        String nondup = StringUtility.removeDuplicates(str);   // a b c

        for (int i = 0; i <= nondup.length() - 1; i++) {
            char ch = nondup.charAt(i);   // a
            int count = StringUtility.frequency(str, ch);          // 3 4 2
            result += "" + ch + count;
        }
        return result;

    }


}


