package INTRO;

import java.util.Scanner;

class Scanner_Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter your roll no ");
        // int rollno = sc.nextInt();
        

        System.out.println("Enter you name ");
        String s = sc.nextLine();
        System.out.println(s);

        // System.out.println(rollno);
        
        System.out.println(args[0]);

        sc.close();

    }
}