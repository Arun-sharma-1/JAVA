package OOPS;
class Test {      
    public static void main(String[] args) {
        Enum e = Enum.high;
        System.out.println(e);

        System.out.println(Enum.valueOf("medium"));

        coffeeSize c1 = coffeeSize.SMALL;
        System.out.println(c1);
         
        System.out.println(c1.getSize());
        System.out.println(c1.index());
        System.out.println(c1.ordinal());
        System.out.println(coffeeSize.valueOf("MEDIUM"));
        

    }
}

enum Enum {
    high,medium, low;
}

// enum consta{
//     1,2,3;
// }
 
enum coffeeSize
{
    SMALL(10), MEDIUM(15), LARGE(20);
    private int size;
    coffeeSize(int size)
    {
        this.size = size;
    }
    int index()
    {
        return SMALL.ordinal();
    }
    public int getSize()
    {
        return size;
    }
}