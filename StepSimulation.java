public class StepSimulation {

    public static void insertionSort(int[] arr) {

        for (int j = 1; j < arr.length; j++) {

            int key = arr[j];
            int i = j - 1;

            System.out.println("Step " + j + ":");

            while (i >= 0 && arr[i] > key) {
                arr[i + 1] = arr[i];
                i--;
            }

            arr[i + 1] = key;

            printArray(arr);
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

        System.out.println("Initial Array:");
        printArray(arr);

        insertionSort(arr);

        System.out.println("Final Sorted Array:");
        printArray(arr);
    }
}
