package day45_Exeptions;

import java.time.LocalTime;

public class EveryDaysLunchBreak {

    public static void main(String[] args) {

        LocalTime currentTime = LocalTime.now();
        LocalTime lunchTime = LocalTime.of(1,30);

        if (currentTime.equals(lunchTime)){
          throw new LuchBreakException("MUHTAR WE NEED TO GO LUNCH!!!");
        }else {
            System.out.println("CONTINUE");
        }

    }
}
