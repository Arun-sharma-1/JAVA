package innerClass;

class Test {
    public static void main(String[] args) {
    //    outer o = new outer()
    //    {
    //         void display()
    //         {
    //             System.out.println("Anonmyous inner class");
    //         }
    //    };
    //    o.display();


        //  Animal a = new Animal(){
        //     @Override
        //     public void eat() {
        //         System.out.println("Anonmyous inner class");
        //     }
        // };
        // a.eat();


        outer o = new outer();
        o.display(new Animal(){
            @Override
            public void eat() {
                System.out.println("Anonmyous inner class");
            }
        });
    }
    
    
}


interface Animal
{
    void eat();
}
class outer {
    void display(Animal a ) {
         System.out.println("hi");
    }

}