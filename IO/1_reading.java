package IO;

import java.io.FileInputStream;
import java.io.IOException;

class Test {
    public static void main(String[] args) {
        FileInputStream f = null;
        try {
            f = new FileInputStream("sample.txt");
            int i = f.read();
            System.out.println((char) i); // reading single characther

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