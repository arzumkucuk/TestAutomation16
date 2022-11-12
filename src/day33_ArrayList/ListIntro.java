package day33_ArrayList;

import java.util.ArrayList;

public class ListIntro {

    public static void main(String[] args) {

        ArrayList <Integer> scores = new ArrayList<>();  // size:2

        scores.add(100); // autoboxing  0
        scores.add(200);  // autoboxing  1
        scores.add(300);  // 2

        scores.add(3,-400); // indexe eksi veremezsin index 0'dan baslar. element eksi olabilir, index size kdr yazilir

        System.out.println(scores);

        ArrayList<String> groceryList = new ArrayList<>();//{Egg, water, milk, bread}
        groceryList.add("Egg");
        groceryList.add("Water");
        groceryList.add("Milk");
        groceryList.add("Bread");

        groceryList.add("Toiilet paper");

        System.out.println(groceryList);



    }
}
