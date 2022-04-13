package Serialization;

import java.io.*;
import java.io.FileOutputStream;

class seria {
    public static void main(String[] args) {
        cat c = new cat();
        c.name = 100; 
        c.id =10;                                                          
        try {
            FileOutputStream fs = new FileOutputStream("result.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);

            os.writeObject(c);

            FileInputStream fi = new FileInputStream("result.ser");
            ObjectInputStream oi = new ObjectInputStream(fi);

          
            cat c1 = (cat)oi.readObject();
            System.out.println(c1.name);
            System.out.println(c1.id);
            c1.Greeting();
             

            oi.close();
            fi.close();

            
            os.close();
            fs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class cat implements Serializable {
    int name;
    transient float id ;
    static int age = 11;

    void Greeting()
    {
        System.out.println("Hello");
    }
}

 
