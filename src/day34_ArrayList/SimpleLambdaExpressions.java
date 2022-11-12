package day34_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class SimpleLambdaExpressions {
    public static void main(String[] args) {

        // Predicate

        ArrayList<Integer> number = new ArrayList<>();
        number.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6) ) ;
       /*
        for (int i=0; i<=number.size()-1; i++){
            if (number.get(i) < 5){
                number.remove(i); // without the interface itarable, remove method cannot be use in loop
            }
        }
        */


        // removeIf()
        System.out.println(number);

        Predicate <Integer> lessThan5 = each -> each < 5;

        number.removeIf(lessThan5);

        System.out.println(number);

        System.out.println("============================================");

        ArrayList<Integer> numbers2= new ArrayList<>();
        numbers2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6));

        numbers2.removeIf(element -> element < 7);
        System.out.println(numbers2);

        System.out.println("============================================");

        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20) );

        scores.removeIf(p -> p % 3 == 0 || p % 5 == 0 );
        // scores.removeIf(p -> p % 5 == 0);

        System.out.println(scores);

        System.out.println("============================================");

        ArrayList<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Ahmed", "Ahmed", "Erjon", "Ahmed", "Ahmed", "Adil", "Afrooz"));
        employees.removeIf(p -> p.startsWith("A") && !p.equals("Ahmed") );

        System.out.println(employees);

        System.out.println("============================================");

        ArrayList<String> employees2 = new ArrayList<>();
        employees2.addAll(Arrays.asList("Ahmed", "Ahmed", "Erjon", "Ahmed", "Ahmed", "Adil", "Afrooz") );

        employees2.removeIf ( p -> p.toLowerCase().contains("a") && p.toLowerCase().contains("r") ); // || yada yaparsan bos kume geliyor

        System.out.println(employees2);



    }
}
