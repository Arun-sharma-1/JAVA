package CODES;

import java.util.Scanner;

class Type {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Text: ");
        String s = sc.nextLine();
        // site - > https://google.com , fps://anything.com
        String start = s.substring(0, s.indexOf(':'));
        if (start.equals("https")) {
            System.out.println("HyperText transfer Protocol ");
        } else if (start.equals("fps")) {
            System.out.println("File transter Protocol ");
        }

        String end = s.substring(s.lastIndexOf('.') + 1); //no end specified means upto last 

        if (end.equals("com"))
            System.out.println("commercial");
        else if (end.equals("org"))
            System.out.println("Organisation ");
        
        sc.close();
    }
}
