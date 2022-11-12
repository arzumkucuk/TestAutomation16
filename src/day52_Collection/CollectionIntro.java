package day52_Collection;

import java.util.*;

public class CollectionIntro {
    /*
    Collection(Interface): extend
     */

    public static void main(String[] args) {

        Collection <Integer> numbers = new ArrayList<Integer>();

        System.out.println(numbers.size() ); // 0

        numbers.add(100);

        System.out.println(numbers.size()); // 1

        numbers.addAll(Arrays.asList(200,300,400,500)); // 5

        System.out.println(numbers.size());

        numbers.removeAll(Arrays.asList(100,400) ); // 3

        System.out.println(numbers.size());

        System.out.println(numbers);

        System.out.println( ( (ArrayList)numbers).get(0) );
        System.out.println( ( (LinkedList)numbers).get(0) );

        Collection<String> names = new LinkedHashSet<>();
        Collection<String> score = new LinkedList<>();




    }
}
