package STRINGS;
class methods 
{
    public static void main(String[] args) {
        String s1 = new String("Java");
        String s2 = new String("Java");

        // String s1 = "Java";
        // String s2 ="Java";

        if(s1.equals(s2)) System.out.println("Value is same "); // it check the content or the value and return boolean value 
        if(s1 == s2) System.out.println("references are same ");

        String s3 =new String("Razi");
        String s4 = new String("Rauz");

        int res = s3.compareTo(s4);
        System.out.println(res);


        System.out.println();
        //////////////////////////////////////////

        String str1 = "java";
        System.out.println(str1.length());
        String str2 = str1.toLowerCase();
        System.out.println(str2);

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str1.startsWith("ja"));
        System.out.println(str1.endsWith("av"));

        System.out.println("JAVA".compareTo("java"));
        System.out.println();
        
        
    }
}
