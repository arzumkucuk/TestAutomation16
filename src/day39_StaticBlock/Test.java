package day39_StaticBlock;


//import library.Data; // imports everything that are static or none static

import static library.Data.data1;

import static library.Data.*;

import static library.ArraysUtility.*;


public class Test {

    public static void main(String[] args) {


        System.out.println(StaticBlocks.company);
        System.out.println(StaticBlocks.employee1);
        System.out.println(StaticBlocks.b);
        System.out.println(StaticBlocks.isEmployed);

        StaticBlocks.company = "Bank Of America";
        System.out.println(StaticBlocks.company);

        System.out.println("====================================");

        System.out.println(data1);
        System.out.println(data2);
        method();
        method2();

        int[] arr = {1,2,3,4,5,6};
        int max = max(arr);
        int min = min(arr);



    }
}
