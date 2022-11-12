package day31_MethodOverLoading;

import library.StringUtility;

import java.util.Locale;

public class FrequencyOfWord {

    public static void main(String[] args) {
        String str = "Today is great day, today we are learning java, today we have java class";

        int count = StringUtility.frequencyOfWord(str,"today");

        System.out.println(count);

        String str2 = "java, JAVA, jAvA, c#, C#, c#, java, java";

        int countJava = StringUtility.frequencyOfWord(str2,"java");
        int countSharp = StringUtility.frequencyOfWord(str2, "c#");
        System.out.println("Count Java= "+ countJava);
        System.out.println("Count Sharp= "+ countSharp);

        System.out.println("==============================================");

        String sentence = "dog dog dog Dog DOG DoG cat cat Cat CAt";
        int countDog = StringUtility.frequencyOfWord(sentence, "dog");
        int countCat = StringUtility.frequencyOfWord(sentence,"cat");

        System.out.println("countDog= "+ countDog);
        System.out.println("countCat= "+ countCat);

        System.out.println(countCat == countDog);




    }
    public static int frequencyOfWord (String sentence, String word){
        sentence = sentence.toLowerCase();
        word = word.toLowerCase();

        int frequency = 0;
        while (sentence.contains(word)){
            sentence = sentence.replaceFirst(word,"");
            frequency++;
        }

        return frequency;
    }

}
 /*
    1. write a return method called frequencyOfWord that accepts two parameters: string str and String word
        Ex:
            str = "Java java java pyhton pyhton"
            word = "java"

            frequencyOfWord(str, word) ==> 3
    2.
    1.create a method that can find the addition of two numbers
        method name: addition2number
    2. createa  method that can find the addition of three numbers
        method name: addition3numbers

     */