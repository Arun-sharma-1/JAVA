package innerClass;

class Test
{
    public static void main(String[] args) {
        outer o= new outer();
        o.display_outer();
        
    }
}
class outer {
    final private int a = 10;

    void display_outer() {
        class inner {
            int b = 20;
            void display_inner() {
                System.out.println(b +" " + a );
                System.out.println("inner class");
            }
        }
        inner i = new inner();
        i.display_inner();
    }
}
