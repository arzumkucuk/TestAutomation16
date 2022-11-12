package day35_Custom_Class;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class ArrayListPractices {
    /*
    task1;

    1. Create an array of string called country names
    2. write a program that can remove all the country names that have length of 10 or greater

    task2;
    1. create an Array of LocalDate
    2. write a progam that can remove all the dates before Auguts-15-2016

    task3;
    1. cretae an Array of String called jobtitles
    2. write a program that only keeps the jobtitles that are: SDET and QA

    task4;
    1. given a list of Integers 1,2,3,4,5,6.. etc. remove all values greater than 100.
            solution 1: use lambda
            solution 2: do not use lambda
     */

    public static void main(String[] args) {

        // task1

        ArrayList <String> country = new ArrayList<>(Arrays.asList("United States", "Turkiye", "Kazakistan", "Turkmenistan"));

        country.removeIf(each -> each.length() >= 10);

        System.out.println(country);

        // task2

        LocalDate[] dates ={
                LocalDate.of(2016, 8, 15),
                LocalDate.of(2015,5,6),
                LocalDate.of(2011,6,8),
                LocalDate.of(2020,04,8),
                LocalDate.of(2005,05,06)
             } ;

        LocalDate d1 = LocalDate.of(2016,8,15);
        ArrayList <LocalDate> arrDates = new ArrayList<> (Arrays.asList(dates));
        arrDates.removeIf(p -> p.isBefore(d1) );

        System.out.println(arrDates);


        // task3;

        ArrayList <String> jobTitles = new ArrayList<>(Arrays.asList("Engineer", "QA", "Teacher", "Sale person", "SDET"));

        jobTitles.removeIf(p -> !p.equalsIgnoreCase("QA") && !p.equalsIgnoreCase("SDET"));

       // jobTitles.retainAll(Arrays.asList("SDET", "QA") );

        System.out.println(jobTitles);

        // task4

        ArrayList <Integer> numbers = new ArrayList<>(Arrays.asList(1,3,4,5,6,7,100,110,120,130));

        // solution1

        numbers.removeIf(e -> e >100);
        System.out.println(numbers);

        // if only keep the numbers 7,8,9
       // numbers.retainAll(Arrays.asList(7,8,9));

        // solution2

        ArrayList <Integer> temp = new ArrayList<>();
        for ( int each : numbers){
            if (each<=100){
                temp.add(each);
            }
        }
        numbers = temp;
        System.out.println(numbers);

    }
}
