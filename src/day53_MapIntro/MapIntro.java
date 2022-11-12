package day53_MapIntro;

import java.util.*;

public class MapIntro {

    public static void main(String[] args) {



        Map<String, String> credentials1 = new HashMap<>(); // random
        Map<String, String> credentials2 = new LinkedHashMap<>();  // keeps the insertion order
        Map<String, String> credentials3 = new TreeMap<>();   // sorted,  does not accept null
        Map<String, String> credentials4 = new Hashtable<>(); // is synchronized, thread-safe

    }
}
