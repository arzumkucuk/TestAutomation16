package day11_NestedIf_Switch;

import java.util.SortedMap;

public class NestedIf_Practice2 {
    public static void main(String[] args) {
        /*
          1 monday
          2 tuesday
          3 wednesday
          .
          .
          7 sunday
          invalid ==> there is no such a day
         */

        int day = 8;
        boolean validNumber = day >= 1 && day <=7;

        String result="";

        if (validNumber){

            if(day==1){
                result="Monday";
            }else if(day==2){
                result ="Tuesday";
            }else if (day==3){
                result="Wednesday";
            }else if (day==4){
                result="Thursday";
            }else if (day==5){
                result="Friday";
            }else if (day==6){
                result="Saturday";
            }else { // day==7
                result="Sunday";
            }

        }else{ // invalid number
            result="Invalid";
        }
        System.out.println(result);

        String result2= (day==1) ? "Sunday" :(day==2) ? "Tuesday" : (day==3) ? "Wednesday" : (day==4) ? "Thursday"
                        : (day==5) ? "Friday" : (day==6) ? "Saturday" : (day==7) ? "Sunday" : "Invalid";
        System.out.println(result2);



    }
}
