package L33__Local_Date_Time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        m.LDT1();
        m.LDT2();
        m.LDT3();
        m.LDT4();
        m.LDT5();
        m.LDT6();
    }


    // .now()
    public void LDT1(){
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
    }

    // .plusDay     // . minusDay
    public void LDT2(){
        LocalDateTime localDateTime = LocalDateTime.now().plusDays(3);
        LocalDateTime localDateTime1 = LocalDateTime.now().minusDays(5);
        System.out.println(localDateTime);
        System.out.println(localDateTime1);
    }

    // .now().with(LocalTime.MIN)     // .now().with(LocalTime.MAX)
    // sa tk day nk sone tk day ko sitt yin tone
    public void LDT3(){
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime1 = LocalDateTime.now().minusWeeks(1);
        System.out.println("Start of week " + localDateTime1.with(LocalTime.MIN));
        System.out.println("End of week " + localDateTime.with(LocalTime.MAX));
    }


    // .now().atStartOfDay()
    public void LDT4(){
        // local date time => local date
        LocalDateTime localDateTime = LocalDate.now().atStartOfDay();

        // local date => local date time
        LocalDate localDate = localDateTime.toLocalDate();
        System.out.println(localDateTime);
        System.out.println(localDate);
    }


    // .now()getDayOfMonth / Week / Year
    public void LDT5(){
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.getDayOfYear());
    }

    // .now()getNano/Second/Minute/Hour/Year
    public void LDT6(){
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.getHour());
    }

}
