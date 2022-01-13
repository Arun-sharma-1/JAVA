package INTRO;

// import java.lang.ProcessBuilder.Redirect.Type;

class TYPECASTING
{
    public static void main(String[] args) {
        int i=10;
        double j = i*10;
        
        System.out.println( ( (Object) i) .getClass().getSimpleName() );
        System.out.println( ( (Object) j) .getClass().getSimpleName() );

        double d= 89999999999l; // int can not store such long value so it will give the maxm value that it can store
        int c = (int)d;
        System.out.println(c);
        
       

        int  b=130;
        byte a  = (byte)b;
        System.out.println(a);
        
        byte b1=0b1111111;
        System.out.println(b1);

    }
}