package day12_Switch_Scanner;

public class DaysInMonths {

    public static void main(String[] args) {

        int months = 6;
        String days = "";

        switch (months){

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = "31 days";
                break;
            case 2:
                days = "28 days";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days= "30 days";
                break;
            default:
                days= "Invalid";
                break;


        }

        System.out.println(days);

        System.out.println("======================================");












    }
}
