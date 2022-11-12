package day52_Collection;

import com.sun.org.apache.xalan.internal.xsltc.trax.XSLTCSource;

import java.util.*;

public class SetPractice {
    
    static String str3;

    public static void main(String[] args) {

        Set<String> names = new HashSet<>();
        names.addAll(Arrays.asList("Aysel", "Amir", "Mohamed", "Busra", "Necdat", "Ercan","Hoshang", "Hoshang","Hoshang" ));
        System.out.println(names);

        Set<String> names2 = new LinkedHashSet<>();
        names2.addAll(Arrays.asList("Aysel", "Amir", "Mohamed", "Busra", "Necdat", "Ercan", "Hoshang", "Hoshang","Hoshang"));
        System.out.println(names2);

        Set<String> names3 = new TreeSet<>();
        names3.addAll(Arrays.asList("Aysel", "Amir", "Mohamed", "Busra", "Necdat", "Ercan","Hoshang","Hoshang","Hoshang"));
        System.out.println(names3);

        System.out.println("==================================================");

        String str = "gggaaaabbbbbbccccccdddd"; // gabcd
        String result = "";
/*
        for (String s : new LinkedHashSet <> (   Arrays.asList(str.split("") ) ) ) {
            result += s;
        }

 */

        String[] arr = str.split("");
        System.out.println(Arrays.toString(arr)); // [[g, g, g, a, a, a, a, b, b, b, b, b, b, c, c, c, c, c, c, d, d, d, d]

        LinkedHashSet<String> hs = new LinkedHashSet<>();
        hs.addAll(Arrays.asList(arr)); // [g,a,b,c,d]

        for (String each : hs) {
           result += each;

        }
      //  System.out.println(hs.get(0);
        System.out.println(result);

        System.out.println("=================================================");

        String str1 = "silent";
        String str2 = "listen";
        
        String s1 = new TreeSet<>(Arrays.asList( str1.split("") ) ).toString();
        String s2 = new TreeSet<>(Arrays.asList( str2.split("") ) ).toString();

        System.out.println(s1.equals(s2));

        System.out.println("=================================================");

        // Null key:

        System.out.println(str3);

        //System.out.println(str3.toUpperCase() );
        
        HashSet<Integer> linkedHashSet = new HashSet<>();
        linkedHashSet.addAll(Arrays.asList(null,null,null,null,null) );
        
        System.out.println(linkedHashSet);
        
        TreeSet<Integer> treeSet = new TreeSet<>();
        //treeSet.addAll(Arrays.asList(null, null, null, null, null));
       // System.out.println(treeSet);
        
      //  String str4 = null;
      //  System.out.println(str4.equals( "Muhtar" ));

        System.out.println("=================================================");
        
        Set<Integer> numbers = new HashSet<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,7,8,9,10));
        numbers.addAll(Arrays.asList(1,2,3,4,5,7,8,9,10));
        
        int maxnum = Collections.max(numbers);
        int Min = Collections.min(numbers);

        System.out.println("maxNum = " + maxnum);

        System.out.println("Min = " + Min);


       // Collections.sort(numbers);
       // Collections.swap(numbers, 0,1);

        //Collections.frequency(numbers,5); //1


        System.out.println("Min = " + Min);
        System.out.println("maxnum = " + maxnum);

        System.out.println("=================================================");

        /*
        dddaaaaccbb
                dacb
                3422
        output:
                d3a4c2b2
         */

    }
}
