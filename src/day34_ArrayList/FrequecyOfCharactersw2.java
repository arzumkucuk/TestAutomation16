package day34_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class FrequecyOfCharactersw2 {
    public static void main(String[] args) {


        String str = "AAABBCDDDDEEE";
        String result = "";

        ArrayList<Character> list = new ArrayList<>();

        for (char each : str.toCharArray())
            list.add(each);

        for (char each : list){
            int f = Collections.frequency(list,each);

            if (result.contains(""+each)){
                continue;
            }
            result += each+"" + f;
        }
        System.out.println(result);

    }
}