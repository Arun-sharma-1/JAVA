package Date;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.*;
import java.util.*;
public class dateFormatter {
    public static void main(String[] args) {
        LocalDate dt = LocalDate.now();
    
        ZonedDateTime zd = ZonedDateTime.now();

        // DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss z Z");
        System.out.println(df.format(zd));
    }
}
