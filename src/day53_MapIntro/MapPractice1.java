package day53_MapIntro;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MapPractice1 {

    public static void main(String[] args) {

        // Map =  key + value ==> key'ler farkli olmali, value ayni olabilir
        Map<String, Double> employeeInfo = new LinkedHashMap<>();
        // put(key, value) : insert the given key and value into the map
        employeeInfo.put("Afrooz", 120000.0);
        employeeInfo.put("Ercan", 125000.0);
        employeeInfo.put("Ayse", 125000.0);
        //employeeInfo.put("Afrooz", 120000.0); // Map accepts duplicates but not count size. size normalde 3 olur ama esit oldugu icin 2 cikar

        // remove(Key): removes the value at given key.
      //  System.out.println(employeeInfo.remove("Ercan"));

        System.out.println(employeeInfo.size() );
        System.out.println(employeeInfo);

        // get(key): returns the value of the given key
        System.out.println("Salary of Ercan = "+ employeeInfo.get("Ercan"));
        System.out.println("Salary of Afrooz= "+ employeeInfo.get("Afrooz"));

        // containsKey(key): verifys if the key is contained, returns boolean
        System.out.println(employeeInfo.containsKey("Ercan"));  // true
        System.out.println(employeeInfo.containsKey("Ayse")); // true

        // containsValue(value): verifys if the value is contained, returned boolean
        System.out.println(employeeInfo.containsValue(150000.0)); // false

        // clear() : clears everything
        //employeeInfo.clear();
        //System.out.println(employeeInfo);

        // isEmpty(): returns boolean
        System.out.println(employeeInfo.isEmpty()); // false

        System.out.println("================================================");


        for (String eachKey : employeeInfo.keySet()){
            System.out.println(eachKey + " : " + employeeInfo.get(eachKey));
        }


        System.out.println("================================================");


        employeeInfo.put("Mustafa", 105000.0);
        employeeInfo.put("Emre", 103000.0);
        employeeInfo.put("Eren", 100000.0);

        double max =0 , min=0;
        String nameMax ="", nameMin ="";

        for (String eachName : employeeInfo.keySet() ) {
            double eachSalary = employeeInfo.get(eachName);

            if (eachSalary > max){
                max = eachSalary;
                nameMax = eachName;
            }
            if (eachSalary < min ){
                min = eachSalary;
                nameMin =eachName;
            }

        }
        System.out.println("nameMax : " + max);
        System.out.println("nameMin : " + min);

        System.out.println("================================================");
        System.out.println(employeeInfo);

       // employeeInfo.values().forEach(p->{ System.out.println(p); });

        for (Double eachValue : employeeInfo.values() ){
            System.out.println(eachValue);
        }

        List<Double> salaries = new ArrayList<>(employeeInfo.values() );
        System.out.println(salaries);

    }
}
