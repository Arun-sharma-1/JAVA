package IO;

import java.io.FileOutputStream;
import java.io.IOException;
class Test {
    public static void main(String[] args) {
        FileOutputStream f = null;
        try {
            f = new FileOutputStream("sample.txt" ,false);
            // f.write('A');
            // f.write(65);

            String s = "Hello world";
            byte b[] = s.getBytes();
            f.write(b,3,6);

        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                f.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}
