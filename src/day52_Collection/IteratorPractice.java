package day52_Collection;

import java.util.*;

public class IteratorPractice {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6));

        // for
        /*
        for (int i = 0; i<=list.size()-1; i++){
           if( list.get(i) <5 ) {
               list.remove(i);
           }
        }

         */

        // for-each loop ==> it is not removoving
        /*
        for (int each : list) {  ==========> it is not removing, kullanamazsin hata veriyor
            if (each<5){
                list.remove(each);
            }
        }

         */

        list.removeIf(p-> p <5);
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) { // has.next(): checks if there is elements that can be iterated, returns boolean
        if(it.next() < 5){  // next(): if hasNext() is true ==> can accsess the elements
                                //     if hasNext() is false ==> no objects can be accsessed
            it.remove();

        }

        }
        System.out.println("list = " + list);


        System.out.println("===================================================");

        Set<Double> set = new LinkedHashSet<>();
        set.addAll(Arrays.asList(1.0, 1.4, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 2.5, 3.5));

        set.removeIf(p-> p < 4.5); // kisa yol

        for (Iterator<Double> i = set.iterator(); i.hasNext() ; ) { // manuel yol
            if (i.next() < 4.5){
                i.remove();
            }
        }
        System.out.println("set = " + set);

        System.out.println("===================================================");

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList(
                "Ahmed", "ahmed", "aHmEd", "John", "Erjon", "Daniel", "Mustafa"
        ));

        //names.removeIf(p -> p.equalsIgnoreCase("ahmed"));

        Iterator<String> n = names.iterator();
        while (n.hasNext()){
            String eachName = n.next();
            if (eachName.equalsIgnoreCase("ahmed")){
                n.remove();
            }
        }

        System.out.println(names);

    }
}
