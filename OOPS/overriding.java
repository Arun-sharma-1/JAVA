package OOPS;

public class overriding {
    public static void main(String[] args) {
        parent s = new Sub();
        s.display();
        // s.show(); this will be error this extra feature is not in parent class so with the help of parent class ref we cannot call
    }
}


class parent {
    
    public void display() {
        System.out.println("parent");
    }

    
}

class Sub extends parent {
    @Override
    public void display() {
        System.out.println("sub");
    }

    void show() {
        System.out.println("show");
    }
}

