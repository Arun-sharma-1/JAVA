package Date;
import java.util.*;
// import java.util.TimeZone;
class Test
{
    public static void main(String[] args) {
        for(int i=0; i<10; i++)
        System.out.println(System.currentTimeMillis()); // from 1970
         

        Date d = new Date();
        System.out.println(d.getTime()); 
        
        System.out.println(d);
        System.out.println(d.getTime()); //milisecond
        System.out.println(d.getDay()); //day of week
        System.out.println(d.getYear() + 1900);


        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc.isLeapYear(2020));
        System.out.println(gc.getFirstDayOfWeek());

        System.out.println(gc.get(Calendar.DAY_OF_WEEK));
        System.out.println(gc.get(Calendar.DAY_OF_MONTH));
        System.out.println(gc.get(Calendar.DAY_OF_YEAR ));
        System.out.println(gc.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println(gc.get(Calendar.WEEK_OF_YEAR));
        System.out.println(gc.get(Calendar.WEEK_OF_MONTH));
        System.out.println(gc.get(Calendar.MONTH));

        // TimeZone t = gc.TimeZone();
        // System.out.println(t.getDisplayName());


    }
}