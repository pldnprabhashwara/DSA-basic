public class InsertionSortShiftCount {
    public static void insertionSort(int[] arr) {

        int shiftCount = 0;

        for (int j = 1; j < arr.length; j++) {
            int key = arr[j];
            int i = j - 1;

            while (i >= 0 && arr[i] > key) {
                arr[i + 1] = arr[i];
                i--;
                shiftCount++;
            }

            arr[i + 1] = key;
        }

        System.out.println("Number of shifts: " + shiftCount);
    }

    public static void main(String[] args) {

        int[] arr = {8, 3, 5, 2, 9, 1};

        insertionSort(arr);

        System.out.println("Sorted Array:");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
