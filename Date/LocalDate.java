package Date;
// import java.util.*;
import java.time.*;
// import java.time.temporal.*;
class Test {
    public static void main(String[] args) {
        // LocalDate date = LocalDate.now();
        // System.out.println(date);

        // LocalDate date1 = LocalDate.of(2020, 3, 18);
        // System.out.println(date1);

        // LocalDate dt = LocalDate.parse("2020-03-18");
        // LocalDate dt = LocalDate.of("2020, Month.MARCH , 18"); 
        // System.out.println(dt);       
        
        // LocalDate d = LocalDate.now(ZoneId.of("America/Argentina/Ushuaia"));
        // d = d.plusDays(10);
        // d= d.minusDays(10);
        // d= d.plusMonths(2);
        // d=d.minusMonths(2);
        // System.out.println(d);

        // LocalDate d1 = LocalDate.now();
        // LocalDate d2 = LocalDate.of(2020, 3, 18);
        // Period p = Period.between(d1, d2);
        // System.out.println(p);
        // System.out.println(p.getYears());
        // System.out.println(p.getMonths());
        // System.out.println(p.getDays());

        // LocalDate d6 = LocalDate.now();
        // LocalDate d7 = LocalDate.of(2022, 3, 19);
        // System.out.println(d6.isBefore(d7));
        // System.out.println(d7.isAfter(d6));
        // System.out.println(d6.isEqual(d7));

        // LocalDate d8 = LocalDate.now();
        // LocalDate d9 = LocalDate.of(2020, 3, 18);
        // System.out.println(d8.isLeapYear());
        // System.out.println(d9.isLeapYear());

        // LocalDate d3 = LocalDate.of(2020, Month.MARCH, 18);
        // LocalDate d4 = LocalDate.of(2020, Month.JUNE, 19);

        // Period p1 = Period.between(d3, d4);
        // System.out.println(p1);

        // LocalTime lt = LocalTime.now();
        // System.out.println(lt);
        // System.out.println(lt.getHour());
        // System.out.println(lt.getMinute());
        // System.out.println(lt.getSecond());
        // System.out.println(lt.getNano());
        // System.out.println();
        // LocalTime lt1 = LocalTime.of(20, 30, 40, 50);
        // System.out.println(lt1);

        // LocalTime lt2 = LocalTime.parse("20:30:40.50");
        // System.out.println(lt2);

        // LocalTime lt3 = LocalTime.now(ZoneId.of("America/Argentina/Ushuaia"));
        // System.out.println(lt3);

        // LocalTime lt4 = LocalTime.now();
        // LocalTime lt5 = LocalTime.of(20, 30, 40, 50);
        // System.out.println(lt4.isBefore(lt5));
        // System.out.println(lt5.isAfter(lt4));


        // LocalTime lt6 = LocalTime.of(10, 30);
        // System.out.println(lt6);

        // LocalTime lt4 = LocalTime.now();
        // LocalTime lt5 = LocalTime.of(10, 30);
        // LocalTime lt6 = LocalTime.of(10, 30, 30);
        // LocalTime lt7 = LocalTime.of(10, 30, 30, 100);
        // System.out.println(lt4);
        // System.out.println(lt5);
        // System.out.println(lt6);
        // System.out.println(lt7);
        
        // LocalTime lt8 = LocalTime.now();
        // LocalTime lt9 = LocalTime.of(10, 30, 30);
        // System.out.println(lt8.isBefore(lt9));
        // System.out.println(lt8.isAfter(lt9));

        // LocalTime lt4 = LocalTime.now();
        // LocalTime lt5 = LocalTime.of(12, 30, 30);
        // Duration d = Duration.between(lt4, lt5);
        // System.out.println(lt4);
        // System.out.println(lt5);
        // System.out.println(d);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        

        
    }
}
