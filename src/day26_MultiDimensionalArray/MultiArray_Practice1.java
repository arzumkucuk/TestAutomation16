package day26_MultiDimensionalArray;

import java.util.Arrays;

public class MultiArray_Practice1 {
    /*
        tester : {"Liliia", "Odina", "Christina", "Elkem" }
        Devoloper: {"Ahmet", "Erfan", "Roza", "Sarah"}
        SM: {"Nurmanet"}
        PO:{"Nadir"}
        BA: {"Alex"}

        scrumTeam: testers , developers, SM, PO, BA

     */
    public static void main(String[] args) {
        String[] testers = {"Liliia", "Odina", "Christina", "Elkem"};
        String[] developers = {"Ahmet", "Erfan", "Roza", "Sarah"};
        String[] SM = {"Nurmanet"};
        String[] PO = {"Nadir"};
        String[] BA = {"Alex"};

        String[] testers2 = {"Irine", "Aslan", "Nazar"};

        String [][] scrumTeam = {testers, developers, SM, PO, BA};
        //                          0         1        2   3  4
        System.out.println(Arrays.deepToString(scrumTeam));

        scrumTeam[4][0]= "Adam"; // Alex degisti Adam oldu
        scrumTeam[1][2] = "Emine"; // Roza yerine Emine geldi
        scrumTeam[0] = testers2;
        scrumTeam[3][0] ="Zeki";

        System.out.println(Arrays.deepToString(scrumTeam));

        for (String[] each : scrumTeam) {
            for (String name : each) {
                System.out.println(name);

            }
           // System.out.println(Arrays.toString(each));
        }
        System.out.println("=============================================");

        int[][] scores = { {10,20,30,45}, {60,55,75,105}, {93,48,125,135}  };
        //  print out the numbers that are divisible by 3 or 5

        for (int[] each : scores){
            for (int divisible : each){

                if (divisible%3==0 && divisible%5==0){
                    System.out.println(divisible);
                }
            }
        }

    }
}
