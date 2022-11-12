package day32_LocalDate_WrapperClass;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Time {

    public static void main(String[] args) {

        LocalTime t1 = LocalTime.of(11,45,55); //24
        System.out.println("t1 = "+ t1);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        System.out.println("=====================================");
        LocalDateTime t2 = LocalDateTime.of(2020,10,23,11,50);
        System.out.println(t2);

        LocalDateTime t3 = LocalDateTime.now();
        System.out.println(t3);

    }
}
