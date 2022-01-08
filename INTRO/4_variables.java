package INTRO;

/*

class Variables1
{
    public static void main(String[] args) {
        int a; // local variable
        System.out.println(a); //ERROR

        int a =6;
        sysout(a);
    }
}

*/

//====================================================================
//You can not make local variable as static variable 
class Variable {
    int regno; // instance variable
    static int rollNo; // static variable // by default the value of static variable is 0

    static int staVar;
    static {
        staVar = 2000;
    }

    public static void main(String[] args) {
        // WARNING = you can not create stati variable here

        int salary = 10; // local variables
        System.out.println("value of local variable salary is  " + salary);

        // How to access instance varibles
        Variable ref = new Variable();
        System.out.println("The value of instance variable regno is - " + ref.regno);

        // How to access Static variables
        System.out.println("The value of static variable rollNo  is - " + rollNo);
        System.out.println("The value of static variable staVar is - " + staVar);

        char x = 0x03C8; //UNICODE
        System.out.println(x);
        
    }
}

// ====================================================================

/*
class Variables3 {
    public static void main(String[] args) {
        int a = 10;
        {
            int a = 20; // Error
            System.out.println(a);
            int b = 100;
        }
        System.out.println(b); // ERROR
    }

}
*/
