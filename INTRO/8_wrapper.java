package INTRO;

//Java program to convert primitive into objects  
//Autoboxing example of int to Integer  
class WrapperExample1 {
    public static void main(String args[]) {
        // Converting int into Integer
        int a = 20;
        Integer i = Integer.valueOf(a);// converting int into Integer explicitly
        Integer j = a;// autoboxing, now compiler will write Integer.valueOf(a) internally

        System.out.println(a + " " + i + " " + j);
        String res = args[0];
        System.out.println(res);


        Integer I = Integer.valueOf("10");
        System.out.println(I.intValue());
        System.out.println(I);
    }
}

class WrapperExample2 {
    public static void main(String args[]) {
        // Converting Integer to int

        Integer a = Integer.valueOf(3);
        int i = a.intValue();// converting Integer to int explicitly
        int j = a;// unboxing, now compiler will write a.intValue() internally

        System.out.println(a + " " + i + " " + j);
    }

    public class Main
{
    
    static int x;
	public static void main(String[] args) {
	 int x;
// 	 System.out.print(x);
	 System.out.print(Main.x);
	}
}

}