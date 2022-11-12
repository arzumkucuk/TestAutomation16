package day11_NestedIf_Switch;

public class DaysInMonths {

    public static void main(String[] args) {

        int month = 2;
        int year = 2024;

        boolean days28 = month == 2;
        boolean days30 = month == 4 || month ==6 || month ==9 || month ==11;
        boolean days31 = month == 1 || month ==3 || month ==5 || month ==7 || month==8 || month== 10 || month==12;
        //      days31 =    !days28 || !days30
        String result ="";

        if (days28){
            if (year%4==0){
                result = "29 days";
            }else {
                result="28 days";
            }
        }else if (days30){
            result="30 days";
        }else if (days31){
            result="31 days";
        }else {
            result = "Invalid";
        }

        System.out.println(result);


    }

}
