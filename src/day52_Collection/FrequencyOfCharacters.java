package day52_Collection;

import java.util.*;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "aaabbc";
        String result = ""; // a3b2c1 ==> a b c ==> 3 2 1

        for (String s : new LinkedHashSet<>(Arrays.asList(str.split("")))) { // S: a,b,c
            int f = Collections.frequency( Arrays.asList(str.split("") ), s ); // returns the frequency of s in str
            result += s + f;

        }

        System.out.println(result);


        System.out.println("=============================================");

        // getOption();

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10);
        Set<Integer> set = new LinkedHashSet<>(list);

        // getWindowHandles()

        Set<Integer> set2 = new LinkedHashSet<>(Arrays.asList(1,2,3,4,5));
        List<Integer> list2 = new ArrayList<>(set2);

        System.out.println(list2.get(3));


    }
}
