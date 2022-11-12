package day34_ArrayList;

import java.util.ArrayList;

public class warmupTasks {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        list.set(list.size()-1,0);
        System.out.println(list);

        System.out.println("===============");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        System.out.println(list2);
/*
        for (int each : list2){
            if (each%2==1){
                each=each*2;
            }
            System.out.print(each+" ");
        }
        bu sekilde parantezsiz cikiyor
 */
        for (int i = 0; i<=list2.size()-1; i++){
            int each = list2.get(i);
            if (each % 2 != 0){
                list2.set(i,each*2);
            }
        }
        System.out.println(list2);

        System.out.println("==========================");

        int[] scores = {65,75,77,85,68,88,82,72,95,99,98,94,93,72,75,55,71,62};

        ArrayList<Integer> AList = new ArrayList<>();
        ArrayList<Integer> BList = new ArrayList<>();
        ArrayList<Integer> CList = new ArrayList<>();
        ArrayList<Integer> DList = new ArrayList<>();
        ArrayList<Integer> FList = new ArrayList<>();

        for (int each : scores){
            if(each >= 0 && each <= 100) { // if the score is valid
                if (each >= 90) {
                    AList.add(each);
                } else if (each >= 80) {
                    BList.add(each);
                } else if (each >= 70) {
                    CList.add(each);
                } else if (each >= 60) {
                    DList.add(each);
                } else {
                    FList.add(each);
                }
            }else{
                continue;
            }
        }
        System.out.println("total number of A: "+AList);
        System.out.println("total number of B: "+BList.size());
        System.out.println("total number of C: "+CList.size());
        System.out.println("total number of D: "+DList.size());
        System.out.println("total number of F: "+FList.size());










    }


}
/*
    1. write a program that can set the last element of the integer arraylist to zero
    ex:
        list = [1,2,3,4,5]
        output: [1,2,3,4,0]

    2. write a program that can multiplay each odd number by 2
    ex:
        list = [1,2,3,4,5]
        output: [2,2,6,4,10]

    3. grades

 */