package INTRO;

class Datatype {
    public static void main(String[] args) {
        char ch = 'a';

        System.out.println("char Representation: " + ch);
        System.out.println("Unicode Representation: " + (int) ch);

        System.out.println(" ");
        System.out.println("Size of characther : " + Character.SIZE + " bits");
        System.out.println("size of integer: " + Integer.SIZE + " bits");
        System.out.println("size of Float: " + Float.SIZE + " bits");
        System.out.println("size of Double: " + Double.SIZE + " bits");

        System.out.println(" ");
        System.out.println("Size of characther : " + Character.BYTES + " Bytes");
        System.out.println("size of integer: " + Integer.BYTES + " Bytes");
        System.out.println("size of Float: " + Float.BYTES + " Bytes");
        System.out.println("size of Double: " + Double.BYTES + " Bytes");

    }
}
