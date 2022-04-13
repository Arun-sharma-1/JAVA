package Exceptions;

class stackoverflowExample {
    public static void main(String[] args) {
        stackoverflowExample obj = new stackoverflowExample();

       obj.someMethod();

    }

    void someMethod() {
        try {
            int i = 1;
            System.out.println(i);
            someMethod();
        } catch (StackOverflowError ste) {
            System.out.println("Stack over flow occured");
        }

    }
}
