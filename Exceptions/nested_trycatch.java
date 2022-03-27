package Exceptions;

public class nested_trycatch {
    public static void main(String[] args) {
        int a =10;
        int b=0;
        try{

            try
            {
                int c = a/b;
                System.out.println("Normal exection of program ... " + c);

            }
            catch(IndexOutOfBoundsException e)
            {
                System.out.println("Exception occured ");
            }

            try
            {
                int d=b/a;
                System.out.println(d);
            }
            catch(Exception e)
            {
                System.out.println("Exception occured at second block  " + e);
            }
             

        }
        catch(Exception e)
        {
            System.out.println("This is final large exception block " + e);
        }
    }
}
