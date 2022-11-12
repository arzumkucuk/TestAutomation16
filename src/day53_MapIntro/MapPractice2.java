package day53_MapIntro;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;

public class MapPractice2 {

    public static void main(String[] args) {

        TreeMap<String, Integer> scores = new TreeMap<>();
        scores.put("Ercan", 99);
        scores.put("Eren", 82);
        scores.put("Javad", 64);
        scores.put("Muhtar", 75);
        scores.put("Arzum", 95);
        scores.put("Sevgi", 83);
        scores.put("John", 81);
        scores.put("Darren", 92);
        scores.put("Julia", 77);

        scores.replace("John", 79);

        List<String> earlyBirds = new ArrayList<>(); // >=80
        List<String> angryBirds = new ArrayList<>(); // <=80

        //scores.keySet().forEach(p-> { if(scores.get(p) >= 80 ) earlyBirds.add(p); else angryBirds.add(p); } );

        for (String name : scores.keySet()){
            int score = scores.get(name);
            if (score >= 80){
                earlyBirds.add(name);
            }else{
                angryBirds.add(name);
            }
        }
        System.out.println("earlyBirds = " + earlyBirds);
        System.out.println("angryBirds = " + angryBirds);

        System.out.println("=================================================");

        LinkedHashMap<String, LocalDate> birthDays = new LinkedHashMap<>();
        birthDays.put("Jimmy", LocalDate.now());
        birthDays.put("Arzum", LocalDate.of(1995,5,6));
        birthDays.put("Eren", LocalDate.of(1981,6,1));
        birthDays.put("Sevgi", LocalDate.of(1994,7,29));
        birthDays.put("Asu", LocalDate.of(1996,8,21));
        birthDays.put("Selda", LocalDate.of(1972,10,13));





    }
}
