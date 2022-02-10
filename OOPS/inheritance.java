package OOPS;

/* 
class Student{

    Student()
    {
         System.out.println("parent");
    }
     
}
class Student1 extends Student{
  
    Student1()
    {
       System.out.println("child");
    }                       
}
public class Main
{
	public static void main(String[] args) {
		 Student1 s = new Student1();
		 
	}
}
*/
public class inheritance {
    public static void main(String[] args) {
        Student1 s = new Student1(1, "Raj", 20);
        System.out.println(s.id);
        System.out.println(s.age);

        s.display();
    }
}

class Student {
    int id;
    String name;

    Student(int i, String name) {
        this.id = i;
        this.name = name;
    }

    void display() {
        System.out.println("HI, my name is " + name);
    }
}

class Student1 extends Student {
    int age;

    Student1(int i, String name, int age) {
        super(i, name); // compulsary
        this.age = age;
    }
}
