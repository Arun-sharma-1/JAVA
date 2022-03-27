package Array;

/* 
    1 2 3 
    4 5 6
    7 8 9
*/
class Main {
    public static void print(int[][] arr2d) {
        int r, c;
        r = arr2d.length;
        c = arr2d[0].length;
        if(r==1)
        {
            for (int i = 0; i < c; i++) {
                System.out.print(arr2d[0][i] + " ");
            }
        }
        else if(c == 1)
        {
            for (int i = 0; i < c; i++) {
                System.out.print(arr2d[0][i] + " ");
            }
        }
        else {
            for (int i = 1; i < r; i++) {
                System.out.format(arr2d[i][c- 1] + " ");
            }
            for (int i = c-2; i >=0; i--) {
                System.out.format(arr2d[r-1][i] + " ");
            }
            for(int i= r-2; i>=1; i--) {
                System.out.format(arr2d[i][0] + " ");
            }
        }
         
    }

    public static void main(String[] args) {
        // 2dArray

        int[][] arr2d = { { 1, 2, 3 } };
        // snake order print
        print(arr2d);
    }
}
