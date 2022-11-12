package day33_ArrayList;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class DateTimePractice {

    public static void main(String[] args) {

        // task1:
        LocalDateTime d1 = LocalDateTime.of(2022,07,20,13,0);
        DateTimeFormatter df = DateTimeFormatter.ofPattern("EEEE, hh:mm a, MMM/dd/yyyy ");
        //System.out.println(d1.format(df));
        System.out.println(d1.format(df).replaceFirst("PM","pm")); // sistem buyuk PM veriyor soru kucuk pm istiyor

        System.out.println("==============================================================");

        // task2:

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMM/dd, E"); // EEEE gunleri full olarak yazar. E 3 harf olarak yazar
        LocalDate[] days = new LocalDate[5];

        for (int i = 0; i<= days.length-1; i++){
            days[i] = LocalDate.now().plusDays(i+1);
        }

        System.out.println(Arrays.toString(days ));

        for (LocalDate each : days){
            System.out.println(each.format(dtf));
        }

        System.out.println("=========================================================");

        String [] friends = {"Polina", "Serhii", "Aziz", "Halzat", "Abdujilil"};
        LocalDate[] d0fB = {
                LocalDate.of(1991,9,25),
                LocalDate.of(1990,11,23),
                LocalDate.of(1995,02,10),
                LocalDate.of(2005,04,20),
                LocalDate.of(2010,06,05)
        };

        String nameOfOlder = friends[0];
        LocalDate older = d0fB[0] ;

        String nameOfYoungest = friends[0];
        LocalDate younger = d0fB[0] ;

        for (int i=0; i<=d0fB.length-1; i++){

            if (d0fB[i].isBefore(older) ){
                older = d0fB[i];
                nameOfOlder=friends[i];
            }

            if (d0fB[i].isAfter(younger)){
                younger = d0fB[i];
                nameOfYoungest = friends[i];
            }
        }

        System.out.println(nameOfOlder+": "+older);
        System.out.println(nameOfYoungest+": "+younger);








    }


}

/*
        1. use the LocalDate & Time get the date and time in the following format:
			Tuesday, 1.00pm, Nov/24/2020

		2. create an array of LocalDate and store the next 10 day's dates, use for each loop to print each
		Date in the following format:

					MonthName/Day , Name

					ex: November/25, Wednesday

		3. create an array of string and store 5 of your friends' names
		   create an array of LocalDAte and store their DofB

		   find out who is youngest and oldest
 */
