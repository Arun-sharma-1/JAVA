package Array;

class rotate {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };

        for (int j = 0; j < arr.length - 1; j++) {
            int temp = arr[0];
            for (int i = 1; i < arr.length ; i++) {
                arr[i-1] = arr[i];
            }
            arr[arr.length - 1] = temp;
            for (int ele : arr) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }

        // arr become = > 5,1,2,3,4

        // insertion
        int index = 2;
        int value = 20;
        int a[] = new int [10];
        a[0]=1;
        a[1]=21;
        a[2]=2;
        a[3]=3;
        a[4]=4;
        a[5]=5;
        a[6]=6;
        a[7]=7;

        for (int ele : a) {
            System.out.print(ele + " ");
        }
        System.out.println();
        for (int i = 8 ; i>index ; i--) {
            a[i] = a[i-1];
        }
        a[index]=value;
        for (int ele : a) {
            System.out.print(ele + " ");
        }
        


    }
}

