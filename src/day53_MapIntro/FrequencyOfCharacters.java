package day53_MapIntro;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "aaabbc"; // a3b3b1
        Map<String, Integer> result = new LinkedHashMap<>();

        for (String s : str.split("")) { // a a a b b c
            int f = Collections.frequency(Arrays.asList(str.split("")) , s); // f: 3 3 3 2 2 1
            result.put(s,f);

        }
        System.out.println(result);
    }
}
