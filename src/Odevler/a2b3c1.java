package Odevler;

public class a2b3c1 {

    public static void main(String[] args) {

        String str = "aabbcaaddddd";

        String result = "";
        for (int i = 0; i <= str.length() - 1; i++) {
            String ch = "" + str.charAt(i);

            int count = 0;
            for (int j = 0; j <= str.length() - 1; j++) {
                String ch2 = "" + str.charAt(j);
                if (ch.equals(ch2)) {
                    count++;
                }

            }
            if (count > 1) {
                if (!result.contains(ch)) {
                    result += ""+ch+count;
                }

            }

        }

        System.out.println(result);
    }
}