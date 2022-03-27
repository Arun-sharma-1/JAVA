package Date;
import java.util.*;
public class TRY 
{
    public static void main(String ...args)
    {
        
        Date d = new Date();
        Characther
        String text = "15-08-1947";
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        
        try
        {
            d = sdf.parse(text);
            System.out.println(d);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}