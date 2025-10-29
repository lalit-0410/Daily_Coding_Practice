package Sorting;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;


        for (int i = 0; i < n - 1; i++) {
           int swapped = 0;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped++;
                }
            }
            // if no swapping happened → array already sorted
            if (swapped==0) {
                break;
        }System.out.println("No of swaps "+swapped);
        }

    }

    public static void main(String[] args) {
        int[] arr = {5,4,1,3,2};
        bubbleSort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
