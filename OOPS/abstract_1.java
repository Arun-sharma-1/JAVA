package OOPS;

class Test {      
    public static void main(String[] args) {
        sub s = new sub();
        s.display(10);

        
    }
}

abstract class Abstract {
    // CONSTRUCTOR
    Abstract() {
        System.out.println("parent con...");
    }

    // METHOD
    void dislayGreeting() {
        System.out.println("parent method...");
    }

    // abstract method
    abstract void display(int length);
}

class sub extends Abstract {
    // redefine = > overriding
    @Override
    void display(int len) {

        System.out.println("child method..." + len);
    }
}
