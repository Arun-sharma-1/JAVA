package Array;

class programs {
    public static void main(String[] args) {
        int arr[] = { 1, 87, 3, 45 };
        int sum = 0;
        for (int ele : arr)
            sum += ele;
        System.out.println(sum);

        for (int i = 0; i < arr.length; i++) {
            if (11 == arr[i])
           {
            System.out.println("Found");
            System.exit(0);
           }   
        } 
        System.out.println("Not found");


        //FINDING second MAX VLAUE 
        int max1 = arr[0];
        int max2 =max1;
         
        for(int i=1; i<arr.length; i++)
        {
            if(arr[i] > max1)
            {
                max2= max1;
                max1 = arr[i];
            }
            else if(arr[i] > max2) max2  = arr[i];
        }

        
        System.out.println(max2);
    }
}
