package Exceptions;

public class stackoverflow {
    public static void main(String[] args) {
        someMethod();

    }

    static void someMethod() {
        try {
            int i = 1;
            System.out.println(i);
            someMethod();
        } catch (StackOverflowError ste) {
            System.out.println("Stack over flow occured");
        }

    }
}
