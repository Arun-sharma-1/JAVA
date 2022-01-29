package CODES;

import java.util.Scanner;

class RADIX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter String: ");
        // String s = sc.next();
        String s = "11";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                System.out.println("This is hexadecimal no");
                System.exit(0);
            }
            s = s.substring(0, s.length() - 1);
        }
        sc.close();
    }
}
