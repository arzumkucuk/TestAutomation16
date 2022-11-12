package day30_ReturnMethods;

public class UniqueElements {

    public static void main(String[] args) {

        String str = "aaabbbcccdddeffg";
        String unique = "";  // "eg"

        for (int i = 0; i <= str.length() - 1; i++) {
            /*
            char each = str.charAt(i);
            int count = frequencyOfChar(str, each);
            if ( count == 1){
                unique += each;
            }

             */
            char each = str.charAt(i); // each character of the string
            int count = frequencyOfChar(str, each);  // finding the frequency of every single char from str

            if (count == 1) {
                unique += each;
            }
        }
        System.out.println(unique);

        System.out.println("==================================");
        String word = "ababcdedeh";
        String result1 = unique(word);

        System.out.println(result1);
    }

    //                                 "aaabc" ,   'a' ==> 3
    public static int frequencyOfChar(String str, char ch) {
        int count = 0;

        for (char each : str.toCharArray()) {  // [a,a,a,b,c]
            if (each == ch) {
                count++;
            }
        }
        return count;
    }

    public static String unique(String str) {
        String unique = "";

        for (int i=0; i<=str.length()-1; i++){
            char each = str.charAt(i);
            int count = frequencyOfChar(str,each);

            if (count ==1){
                unique += each;
            }
        }
        return unique;
    }






}
