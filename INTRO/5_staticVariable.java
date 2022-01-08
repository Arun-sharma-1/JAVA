package INTRO;

/*
Two class will be created for this inside  .class , in the starting only MainStatic is loaded to .class when we will create new obj then
 staticvariable class also loaded to main. obj1 and obj2 are stored in heap memory 
*/



class MainStatic
{
    public static void main(String[] args) {
        StaticVarible obj1= new StaticVarible();
        StaticVarible obj2= new StaticVarible();
        obj1.increment();
        obj2.increment();

        System.out.println(obj1.number); //2
        System.out.println(obj2.number); //2
    }
}
class StaticVarible
{
    int count=0; // instance variable so both obj have different copy of this 
    static int number=0;
    public void increment() 
    {
        count++;
        number++;
    }
}