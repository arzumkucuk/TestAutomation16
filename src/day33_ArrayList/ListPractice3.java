package day33_ArrayList;

import java.util.ArrayList;

public class ListPractice3 {

    public static void main(String[] args) {

        // remove(index) ve remove(object)

        ArrayList<String> names = new ArrayList<>();
        names.add("Katy"); // 0
        names.add("Amir"); //`1
        names.add("Nadir");// 2
        names.add("Erjon");// 3
        names.add("Amir");// 4
        names.add("Aibek");// 5
        names.add("Ilgar");// 6
        names.add("Amir"); // 7
        names.add("Amir"); // 8

        System.out.println(names);
        names.remove(1);
        System.out.println(names);

        names.remove("Amir"); // ilk yazan Amiri cikarir
        System.out.println(names);

        names.remove(names.size()-1 );
        System.out.println(names);

        names.clear(); // tum listeyi siler
        System.out.println(names);

    }
}
