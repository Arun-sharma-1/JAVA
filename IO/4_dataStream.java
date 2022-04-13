package IO;

import java.io.*;

class dataStream {
    public static void main(String[] args) {
        try {
            DataInputStream ds = new DataInputStream(new FileInputStream("sample.txt"));
            DataOutputStream dos = new DataOutputStream(new FileOutputStream("sample.txt"));
            // dos.writeChar(22);
            dos.writeInt(22);
            dos.writeInt(223);
            dos.writeDouble(22.33);
            // System.out.println(ds.readInt());
            // System.out.println(ds.readDouble());
            // System.out.println(ds.readBoolean());
            // System.out.println(ds.readChar());
            // System.out.println( (char)(ds.read()));
            System.out.println(ds.readInt() );
            System.out.println(ds.readInt() );
            System.out.println(ds.readDouble() );
            // System.out.println(ds.readChar());

            ds.close();
            dos.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
