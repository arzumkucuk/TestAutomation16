package day30_ReturnMethods;

public class uniquetekrar {

    public static void main(String[] args) {
        String word = "aabbsscdrggdhds";
        String res = unique1(word);
        System.out.println(res);
    }

    public static int frequency (String str, char ch){

        int count =0;
        for (char each : str.toCharArray()){
            if (each == ch){
                count++;
            }
        }
        return count;
    }

    public static String unique1 (String str){
        String result = "";

        for (int i = 0; i<=str.length()-1; i++){
            char each = str.charAt(i);
            int count = frequency(str,each);

            if (count==1){
                result+=each;
            }
        }
        return  result;
    }
}
