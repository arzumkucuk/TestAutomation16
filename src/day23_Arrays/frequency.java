package day23_Arrays;

public class frequency {

    public static void main(String[] args) {

        String str ="BBCDAADDDFGT";

        String result ="";

        for (int i=0; i<=str.length()-1; i++){

            String ch = ""+str.charAt(i);
            int count=0;

            for (int j=0; j<=str.length()-1; j++){
                String eachCh = ""+str.charAt(j);

                if (ch.equals(eachCh)){
                    count++;
                }
            }
            if (count>1){
                //result += ch;

                if (!result.contains(""+ ch)){
                   result+=""+ch+count;
                }

            }

        }
        System.out.println(result);
    }
}
