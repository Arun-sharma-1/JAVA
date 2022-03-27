package Array;

/* 
    1 2 3       1 4 7
    4 5 6  =>   2 5 8
    7 8 9       3 6 9
*/
class Main {
    public static void print(int[][] arr2d) {
        int r, c;
        r = arr2d.length;
        c = arr2d[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = i+1; j < c; j++) {
                int temp = arr2d[i][j];
                arr2d[i][j] = arr2d[j][i];
                arr2d[j][i] = temp;

            }

        }

        for (int arr[] : arr2d) {
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        // 2dArray

        int[][] arr2d = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        // snake order print
        print(arr2d);
    }
}
