package day34_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {

    public static void main(String[] args) {
        // containsAll

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        // verify if 10 is contained in the list
        boolean r1 = list.contains(10);

        // verify if 10,30,50 & 60 all are contained in the lost
        boolean r2 = list.contains(10) && list.contains(30) && list.contains(50) && list.contains(60);

        System.out.println("r1= "+ r1);
        System.out.println("r2= "+ r2);

        // verify if 10, 30, 50 & 60 all

        boolean r3 =list.containsAll(Arrays.asList(10, 30, 50, 60) );
        System.out.println(r3);

        ArrayList<String> group1 = new ArrayList<>();
        group1.add("Mohammed");
        group1.add("Svetlana");
        group1.add("Ahmet");
        group1.add("Ercan");

        // Ahmet, Ercan, Biden

        boolean r4 = group1.containsAll(Arrays.asList("Ahmet", "Ercan", "Biden") );
        System.out.println(r4);

        System.out.println("================================================");

        // addAll

        ArrayList <Character> chars = new ArrayList<>(); // A, Z, C, B, H, I, K
        chars.addAll(Arrays.asList('A', 'Z','F', 'B', 'H', 'I', 'K') );

        System.out.println(chars);

        String[] names = {"Mustafa", "Numan", "Abdullah", "Emre", "Inna","Sinan", "Ramiz", "Olesea", "Irina"};
        ArrayList <String> students = new ArrayList<>();
        students.addAll( Arrays.asList(names) );

        // students.addAll (Arrays.asList(names) );

        System.out.println(students);

        Integer [] arr ={1,2,3,4,5};
        ArrayList <Integer> numbers = new ArrayList<>(Arrays.asList(arr));
        System.out.println(numbers);

        ArrayList<Character> ch1 = new ArrayList<>(Arrays.asList('A', 'B', 'C', 'D', 'E') );
        ch1.addAll(Arrays.asList('K','L','M','N'));

        System.out.println(ch1);

        System.out.println("=======================================");

        ArrayList <String> group2 = new ArrayList<>();
        group2.addAll(Arrays.asList(names));

        System.out.println(group2);
        /*
        group2.remove("Irina");
        group2.remove("Sinan");
        group2.remove("Inna");
        group2.remove("Mustafa");

         */

        group2.removeAll(Arrays.asList("Inna", "Irina", "Mustafa", "Sinan"));
        System.out.println(group2);

        System.out.println("=========================================");

        ArrayList<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Ahmed", "Ahmed", "Erjon", "Ahmed", "Ahmed", "Adil", "Afrooz"));
        /*
        for (int i = 0; i<= employees.size()-1; i++){
            employees.remove(i); // without the intercafe iterable, remove method cannot be used in loop
        }

         */

        employees.removeAll( Arrays.asList("Ahmed") );
        System.out.println(employees);

        System.out.println("=================================================");

        // retainAll

        ArrayList<String> employees2 = new ArrayList<>();
        employees2.addAll(Arrays.asList("Ahmed", "Ahmed", "Erjon", "Ahmed", "Ahmed", "Adil", "Afrooz"));

        System.out.println(employees2);

        employees2.retainAll(Arrays.asList("Ahmed"));

        System.out.println(employees2);







    }
}
