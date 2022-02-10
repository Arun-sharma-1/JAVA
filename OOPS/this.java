package OOPS;
/*
class Main {
     
    Main()
    {
        int age = 20;
        System.out.println(this.age); //error
    }
    public static void main(String[] args) {
        
    }
}
*/

class Main1
{
    Main1()
    {
        System.out.println("Constructor called...");
    }
    {
        System.out.println("Intilization block called...");
    }
    static
    {
        System.out.println("Static block called...");
    }
    public static void main(String[] args) {
        new Main1();
    }
}
class Main
{
     Main()
    {
        this(10);
        System.out.println("Constructor called...");
    }
     Main(int a )
    {
         
        System.out.println("Constructor called... "+a);
    }
    
	public static void main(String[] args) {
	    new Main();
		System.out.println("Hello World");
	}
}
