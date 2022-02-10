import java.util.*;

//selection sort -> we find the correct element for the positons 
class selection {

    // this is not c++ fn so we can pass as a ref so these a and b are different
    public static void main(String[] args) {
        SortMethods s = new SortMethods();
        s.sort();
    }
}

class SortMethods {

    void insertion_sort(int[] arr, int N) {
        for (int i = 1; i < N; i++) {
            int value = arr[i];
            int index = i;
            while (index > 0 && arr[index - 1] > value) {
                arr[index] = arr[index - 1];
                index--;
            }
            arr[index] = value;
        }
    }

    void Bubble_sort(int[] arr, int N) {
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    void selection_sort(int[] arr, int N) {
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    void sort() {
        // Taking array from the user
        int[] arr;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of element in the array : ");
        int N = sc.nextInt();
        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        // algo for sorting array -> selection sort =>finding correct pson of ele
        insertion_sort(arr, N);
        for (int ele : arr)
            System.out.print(ele + " ");
        sc.close();
    }
}
