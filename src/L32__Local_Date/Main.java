package L32__Local_Date;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        m.LD();
        m.LD1();
        m.LD2();
        m.LD3();
        m.LD4();
        m.LD5();
        m.LD6();
    }

    //1 .now()
    public void LD (){
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        // plus days (day ko pg)     minus days (day ko noke)
        LocalDate localDate1 = LocalDate.now().plusDays(5);
        LocalDate localDate2 = LocalDate.now().minusDays(3);
        System.out.println(localDate1);
        System.out.println(localDate2);

        // plus months (months ko pg)    minus months (months ko noke)
        LocalDate localDate3 = LocalDate.now().plusMonths(6);
        LocalDate localDate4 = LocalDate.now().minusMonths(3);
        System.out.println(localDate3);
        System.out.println(localDate4);

        // plus years (year ko pg)     minus years (years ko noke)
        LocalDate localDate5 = LocalDate.now().plusYears(2);
        LocalDate localDate6 = LocalDate.now().minusYears(1);
        System.out.println(localDate5);
        System.out.println(localDate6);

        // plus weeks (weeks ko pg)     minus weeks (weeks ko noke)
        LocalDate localDate7 = LocalDate.now().plusWeeks(2);
        LocalDate localDate8 = LocalDate.now().minusWeeks(1);
        System.out.println(localDate7);
        System.out.println(localDate8);


        // ChronoUnit
        LocalDate localDate9 = LocalDate.now().plus(3, ChronoUnit.DAYS);
        LocalDate localDate10 = LocalDate.now().minus(4,ChronoUnit.MONTHS);
        System.out.println(localDate9);
        System.out.println(localDate10);
    }


    //2 .now(clock)
    public void LD1 (){
        Clock clock = Clock.systemDefaultZone();
        System.out.println(clock);
    }


    //3 .now(clock) zoneId
    public void LD2 (){
        ZoneId zoneId = ZoneId.of("America/Anchorage");
        Clock clock2 = Clock.system(zoneId);
        LocalDate localDate2 = LocalDate.now(clock2);
        System.out.println(localDate2);
    }


    //4 .of(year,month,day)
    public void LD3 (){
        LocalDate localDate3 = LocalDate.of(2003, 3 , 1);
        System.out.println(localDate3);
    }


    //5 .parse("year-month-day")
    public void LD4 (){
        LocalDate localDate4 = LocalDate.parse("2003-01-03");
        System.out.println(localDate4);
    }


    //6 .parse("year-month-day")
    public void LD5 (){
        LocalDate localDate5 = LocalDate.parse("2000-01-15").with(TemporalAdjusters.lastDayOfYear());
        System.out.println(localDate5);
    }


    public void LD6(){

        // .now().getDayOfMonth()
        int day = LocalDate.now().getDayOfMonth();
        System.out.println(day);

        // .now().getDayOfWeek()
        DayOfWeek week = LocalDate.now().getDayOfWeek();
        System.out.println(week);

        // .now().getDayOfYear()
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.getDayOfYear());

        // .now().getYear()
        int year = LocalDate.now().getYear();
        System.out.println(year);

        // .now().getMonth()
        Month month = LocalDate.now().getMonth();
        System.out.println(month);

        // .now().isLeapYear()
        LocalDate leap = LocalDate.now();
        System.out.println(leap.isLeapYear());

        // .isAfter(LocalDate.now())
        // .isBefore(LocalDate.now())
        LocalDate date1 = LocalDate.now();     //2022
        LocalDate date2 = LocalDate.now().minus(2,ChronoUnit.YEARS);    //2020
        System.out.println(date1.isAfter(date2));
        System.out.println(date1.isBefore(date2));
    }
}
