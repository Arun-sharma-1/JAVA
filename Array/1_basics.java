package Array;

class Array{
    public static void main(String[] args) {
        int A[] = {};
        System.out.println(A.length);
        System.out.println(A);

        float B[] = { 1,2,3,4};
        for(float ele : B)
            System.out.println(ele++); // we cann't change the value by using for-each loop

        String [] s ={"my","name ","is ","arun","sharma"};
        for(int i=0; i<s.length ; i++)
        {
            System.out.println(s[i]);
        }
    }
}