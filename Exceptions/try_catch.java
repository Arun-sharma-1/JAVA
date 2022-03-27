package Exceptions;

public class try_catch {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            int c = a / b;
            System.out.println("Flow of execution and the value of c is " + c);
        } catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println("Exception occured ");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        finally {
            System.out.println("Finally block is executed");
        }
        System.out.println("Exit...");
    }
}
