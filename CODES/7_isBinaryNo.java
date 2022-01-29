package CODES;

class isBinaryNo {
    public static void main(String[] args) {
        int b = 1011;
        // String s = b + "";
        String s = String.valueOf(b);
        System.out.println(s.matches("[01]+"));

        //hexadecimal
        System.out.println(s.matches("[0-9 A-F]+"));

        //date format -> 01/12/2001
        s="01/12/2001";
        System.out.println(s.matches("[0-3][0-9]/[0-1][1-9]/[0-9]{4}"));
    }
}
