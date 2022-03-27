package Array;

class Main {
    public static void print(int[][] arr2d) {
        for (int i = 0; i < arr2d.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < arr2d[i].length; j++) {
                    System.out.format(arr2d[i][j] + " ");
                }
                System.out.println();
            } else {
                for (int j = arr2d[i].length - 1; j >= 0; j--) {
                    System.out.format(arr2d[i][j] + " ");
                }
                System.out.println();
            }

        }
    }

    public static void main(String[] args) {
        // 2dArray

        int[][] arr2d = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        // snake order print
        print(arr2d);
    }
}
