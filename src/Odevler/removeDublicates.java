package Odevler;

public class removeDublicates {

    public static void main(String[] args) {

        String str = "javacilar";

        String result = "";

        for (int i = 0; i<=str.length()-1; i++){

            String sum = ""+ str.charAt(i);

            if (!result.contains(sum)){
                result += sum;
            }


        }

        System.out.println(result);
    }
}
