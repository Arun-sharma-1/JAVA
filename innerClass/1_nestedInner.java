package innerClass;

// import innerClass.outer.inner;

class Test {
    public static void main(String[] args) {
        outer o = new outer();

        outer.inner s = o.new inner();
        s.display_inner();
        outer.inner san = new outer().new inner(); 
        san.display_inner();

    }
}

class outer {
    // data member or variable
    private int a = 10;

    // methods
    void display_outer() {
        System.out.println("outer class");
    }

    // inner class
     class inner {
        // data member or variable
        int b = 20;

        // methods
        void display_inner() {
            System.out.println(a);
            System.out.println("inner class");
        }
    }

}
