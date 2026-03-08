import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(int[] arr) {

        for (int j = 1; j < arr.length; j++) {
            int key = arr[j];
            int i = j - 1;

            while (i >= 0 && arr[i] > key) {
                arr[i + 1] = arr[i];
                i = i - 1;
            }

            arr[i + 1] = key;
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }


public static void main(String[] args) {
    int[] arr = {8, 3, 5, 2, 9, 1};

    System.out.println("Original Array:");
    printArray(arr);

    insertionSort(arr);

    System.out.println("Sorted Array (Ascending):");
    printArray(arr);
}

}
