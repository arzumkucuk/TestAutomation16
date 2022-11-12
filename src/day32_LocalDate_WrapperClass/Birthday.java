package day32_LocalDate_WrapperClass;

import java.time.LocalDate;

public class Birthday {

    public static void main(String[] args) {

        LocalDate DofB = LocalDate.of(1995,05,06);
        HappyBirthday(DofB.getMonthValue(), DofB.getDayOfMonth());

       // HappyBirthday(07,17);



    }

    public static void HappyBirthday (int month, int day){
        LocalDate birthday = LocalDate.of(1, month,day);
        LocalDate today = LocalDate.now();

        int month2 = today.getMonthValue();
        int day2 = today.getDayOfMonth();

        if (month2 == month && day == day2){
            System.out.println("Today is your birthday!!!");

            return;
        }
        System.out.println("Today is not your Birthday");
    }

}
