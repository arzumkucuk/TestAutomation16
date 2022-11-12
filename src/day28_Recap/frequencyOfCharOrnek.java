package day28_Recap;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class frequencyOfCharOrnek {

    public static void main(String[] args) {

        String str= "AAABBCCDDDE";

        String result ="";

        for (int i=0; i<=str.length()-1; i++){
            String ch = ""+str.charAt(i);

            int count=0;
            for (int j=0; j<=str.length()-1; j++){
                String ch2=""+str.charAt(j);
                if (ch.equals(ch2)){
                    count++;
                }
            }
            if (!result.contains(""+ch)){
                result+=""+ch+count;
            }

        }
        System.out.println(result);
        System.out.println();

        String[] arr = str.split("");
        String result1="";
        for (String each : arr) {
            int count=0;
            for (String ch : arr){
                if (each.equals(ch)){
                    count++;
                }
            }
            if (!result1.contains(each)){
                result1 += each+count;
            }
        }
        System.out.println(result1);
    }
}
