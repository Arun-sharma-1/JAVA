package Array;

import java.util.Scanner;

class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       /* int arr[] = new int[10];
        System.out.println("Enter ele of Array : ");
        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();
            arr[i] = n;
        }
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        //for 2d Arrays
        int arr2d[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr2d[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }
*/
        //JAGGED ARRAY
        int Array2d[][];
        System.out.println("Jagged array ");
        Array2d = new int[3][];
        Array2d[0] = new int[2];
        Array2d[1] = new int[4];
        Array2d[2] = new int[3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < Array2d[i].length; j++) {
                Array2d[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < Array2d[i].length; j++) {
                System.out.format("%2d " , Array2d[i][j] );
            }
            System.out.println();
        }
       
    }
}
