package STRINGS;

class basic 
{
    public static void main(String[] args) {
        String s= "Arun"; // String class using string literal
        String s1="Arun";

        String s2 = new String("Arun");


        System.out.println(s + s1);
        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        //CONSTRUCTOR METHOD FOR CREATING STRINGS 
        char c[]={'A','R','U','N'};
        // String str1=new String(c);
        String str1=new String(c , 1, 2);
        System.out.println(str1);

        byte b[]={65,66,67,68};
        // String str2 = new String(b);
        String str2 = new String(b,1,2); // start form 1 index and print 2 letters
        System.out.println(str2);        
    }
}
