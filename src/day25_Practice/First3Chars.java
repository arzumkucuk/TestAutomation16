package day25_Practice;

public class First3Chars {

    public static void main(String[] args) {

        String [] words ={"Apple", "Banana", "Strawberry", "Java", "Phyton"};

        for (String each : words){
            System.out.println(each.substring(0,3));
        }

    }
}
