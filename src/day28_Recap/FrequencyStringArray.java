package day28_Recap;

public class FrequencyStringArray {


    public static void main(String[] args) {

        String str= "aabcccddeee";
        String result="";

        for (int j=0; j<str.length(); j++){
            String ch1 = ""+str.charAt(j);
            int count =0;
            for (int i=0; i<str.length(); i++){
                String ch2 = ""+str.charAt(i);
                if (ch1.equals(ch2)){
                    count++;
                }
            }
            if (!result.contains(""+ch1)){
                result+=""+ch1+count;
            }
        }
        System.out.println(result);
        System.out.println();



        String[] arr = str.split("");
        String result1="";

        for (String each : arr){
            int count=0;
            for (String each1 : arr){
                if (each.equals(each1)){
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
