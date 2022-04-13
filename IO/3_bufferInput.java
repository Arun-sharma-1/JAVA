package IO;

import java.io.IOException;
import java.io.*;

class bufferInput {
    public static void main(String[] args) {
        try {
            BufferedInputStream  bf = new BufferedInputStream(new FileInputStream("sample.txt"));
            BufferedOutputStream os = new BufferedOutputStream(new FileOutputStream("sample.txt" ,true));
            os.write('s');
            int i;
            while ((i = bf.read()) != -1) {
                System.out.println((char) i);
            }
             
            bf.close();
            os.close();
        } catch (IOException e) {
            System.out.println(e);
        }

         
    }
}
