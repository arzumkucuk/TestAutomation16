package day12_Switch_Scanner;

public class Switch_Practice2 {
    public static void main(String[] args) {

        String productName = "iphone";

        switch (productName){

            case "Galaxy":
                System.out.println("Samsung");
                break;

            case "iphone": // bu sekilde kod yukaridan asagiya okundugu icin output "apple" olarak cikar.
            case "Macbook":
                System.out.println("Apple");
                break;

        }




    }
}
