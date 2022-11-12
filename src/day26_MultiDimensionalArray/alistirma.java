package day26_MultiDimensionalArray;

import java.util.Arrays;

public class alistirma {
    public static void main(String[] args) {

        String[] testers = {"Liliia", "Odina", "Christina", "Elkem"};
        String[] developers = {"Ahmet", "Erfan", "Roza", "Sarah"};
        String[] SM = {"Nurmanet"};
        String[] PO = {"Nadir"};
        String[] BA = {"Alex"};

        String [] dev2= {"Irine", "Nazar", "Ahmet"};
        String[][] scrumTeam = { developers, testers, SM,PO,BA };
        //                          0          1       2  3  4

        System.out.println(Arrays.deepToString(scrumTeam));

        scrumTeam[4][0] ="Adam";
        scrumTeam[1][0] ="Arzum";
        scrumTeam[0] = dev2;

        System.out.println(Arrays.deepToString(scrumTeam));

        for (String[] each : scrumTeam){
            for (String name : each){
                System.out.println(name);
            }
        }
        System.out.println("===========================================");

        int[][] scores = { {10,20,30,45}, {60,55,75,105}, {93,48,125,135}  };

        for (int[] each:scores){
            for (int divisible : each){

                if (divisible%3==0 || divisible % 5==0){
                    System.out.println(divisible);
                }
            }
        }



    }
}
