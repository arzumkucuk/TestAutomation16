package day28_Recap;

import java.util.Arrays;

public class MultiD_Array_Practice {
    public static void main(String[] args) {

        String[] group33 = {"ali", "veli", "kirk", "dokuz", "elli","selin", "arzum", "eren" };
        String[] group22 = {"Aiperi", "ayse", "rosa", "amir", "sevgi"};
        String[] group2 = {"sulo", "adam", "lilia", "violetta"};
        String[] group21 = {"elvin", "alla", "paban", "dilyar", "kamil", "sedge","asilkan", "amin"};
        String[] group17 = {"filip", "huris", "ezgi", "asucuk", "sena"};

        String [][] Batch20 = {group33,group22, group2, group21, group17};
        //                        0      1        2        3        4

        for (int i=0; i<=Batch20.length-1; i++){
            String[] eachGroup = Batch20[i];
           // System.out.println(Arrays.toString(eachGroup) );

            for (int j=0; j<=eachGroup.length-1; j++){ // each name
                String eachStudent = eachGroup[j];
                if (eachStudent.toLowerCase().contains("m")){
                    System.out.print(eachStudent+"  ");
                }
            }
            System.out.println();

        }





    }
}
