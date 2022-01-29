package CODES;

import java.util.Scanner;

class Leapyear 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year: ");
        int yr = sc.nextInt();

        if(yr%4==0)
        {
            //leap year
            if(yr%100==0)
            {
                //not
                if(yr%400==0)
                {
                    System.out.println("leap year ");
                }
                else
                {
                    System.out.println("not leap year ");
                }
            }
            else
            {
                System.out.println("Leap year");
            }
        }
        else
        {
            System.out.println("Not a leap year ");
        }
        sc.close();
    }    
}

 /*            
                 Year 
                /   \
               /     \
            yr%4==0   not leap yr
            /  \
           /    \
          /      \
        yr%100==0  leap year
        /     \
       /       \
    yr%400==0   not leap year
 --> leap year



*/