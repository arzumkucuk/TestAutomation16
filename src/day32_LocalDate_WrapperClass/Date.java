package day32_LocalDate_WrapperClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Date {

    public static void main(String[] args) {

        LocalDate yesterday = LocalDate.of(2020,11,22);

        System.out.println(yesterday);

      //  LocalDate d1 = LocalDate.of(2019,2,29);
       // System.out.println(d1);

        System.out.println( yesterday.isLeapYear() ); // Leap==> true, otherwise==> false


        LocalDate today=LocalDate.now();
        System.out.println(today);



        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        String[] names = {"Julia", "inna", "anna", "ruslan", "livio"};
        LocalDate[] birthdays = {
                             LocalDate.of(1990,11,23),
                             LocalDate.of(1995,02,10),
                             LocalDate.of(2000,03,14),
                             LocalDate.of(2010,04,8),
                             LocalDate.of(2005,05,06)
        };

        for (int i=0; i<= names.length-1; i++){
            System.out.println( names[i] + "' birthday is: "+ birthdays[i]);
            System.out.println(names[i] + " was born on leap year: "+ birthdays[i].isLeapYear()+ "\n" );
        }

    }
}
