package day13_Scanner;

import java.util.Scanner;

public class Browsers {

    public static void main(String[] args) {

        String browserName="chrome";
        // boolean, long, double, float

        switch (browserName){

            case "firefox":
                System.out.println("Opening Firefox browser");
                break;

            case "chrome":
                System.out.println("Opening Chrome browser");
                break;

            case "opera":
                System.out.println("Opening Opera browser");
                break;

            case "safari":
                System.out.println("Opening Safari browser");
                break;

            case "edge":
                System.out.println("Opening Edge browser");
                break;

            default:
                System.out.println("Invalid Browser Name");
                break;


        }





    }
}
