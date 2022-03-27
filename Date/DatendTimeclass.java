package Date;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DatendTimeclass {
    public static void main(String[] args) {
        ZonedDateTime z = ZonedDateTime.now();
        System.out.println(z);
        System.out.println(z.getDayOfMonth());
        System.out.println(z.getDayOfWeek());
        System.out.println(z.getDayOfYear());
        System.out.println(z.getHour());
        System.out.println(z.getMinute());
        System.out.println(z.getMonth());
        System.out.println(z.getMonthValue());
        System.out.println(z.getNano());
        System.out.println(z.getSecond());
        System.out.println(z.getYear());
        System.out.println();

        ZonedDateTime z1 = ZonedDateTime.of(2020, 3, 18, 20, 30, 40, 50, ZoneId.of("America/Argentina/Ushuaia"));
        System.out.println(z1);

        ZonedDateTime z3 = ZonedDateTime.now();
        ZonedDateTime z4 = ZonedDateTime.of(2020, 3, 18, 20, 30, 40, 50, ZoneId.of("America/Argentina/Ushuaia"));
        System.out.println(z3.isBefore(z4));
        System.out.println(z4.isAfter(z3));
        System.out.println(z3.isEqual(z4));

        ZonedDateTime z5 = ZonedDateTime.now(ZoneId.of("America/Argentina/Ushuaia"));
        System.out.println(z5);

        OffsetDateTime o = OffsetDateTime.now();
        System.out.println(o);
    }
}
