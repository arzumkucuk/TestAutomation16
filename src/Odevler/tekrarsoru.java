package Odevler;

public class tekrarsoru {

    public static void main(String[] args) {

        String str="aabb";

        String sum = "";

        for (int i = 0; i<=str.length()-1; i++){

            String s = ""+str.charAt(i);
            if (!sum.contains(s)){
                sum += s;
            }

        }
        System.out.println(sum);


    }
}
