package L34__Local_Time;

import java.time.*;

public class Main {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime.getNano());
        System.out.println(localTime.getSecond());
        System.out.println(localTime.getMinute());
        System.out.println(localTime.getHour());

        // .now().plusNano/Second/Minute/Hour/
        System.out.println(localTime.plusHours(3));

        // zoneDateTime
        ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDateTime.now(),ZoneId.of("Asia/Rangoon"));
        System.out.println(zonedDateTime);
    }
}
