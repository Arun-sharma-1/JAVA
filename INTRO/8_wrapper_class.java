package INTRO;

class wrapper_class
{
    public static void main(String[] args) 
    {
        int j=10;
        // Integer i = new Integer(j);
        // System.out.println(i);

        double d = Double.parseDouble("9.3");
        System.out.println(d);

        long l = Long.parseLong("45");
        System.out.println(l);
        System.out.println( ( (Object) l) .getClass().getSimpleName() );



        String s = Long.toString(342 , 16);
        System.out.println(s);

        Integer intVal =  Integer.valueOf("1001",2);
        // Integer intVal =  Integer.valueOf(j);
        System.out.println(intVal);

        System.out.println( ( (Object) intVal) .getClass().getSimpleName() );

        System.out.println(d+j);
        System.out.println( ( (Object)(j+d)) .getClass().getSimpleName() );


        System.out.println("Arun" + "sharma ");
        
    }   

}
