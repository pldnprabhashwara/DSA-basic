public class InsertionSortDescending {

    public static void insertionSortDesc(int[] arr) {

        for (int j = 1; j < arr.length; j++) {
            int key = arr[j];
            int i = j - 1;

            while (i >= 0 && arr[i] < key) {
                arr[i + 1] = arr[i];
                i = i - 1;
            }

            arr[i + 1] = key;
        }
    }

    public static void main(String[] args) {

        int[] arr = {8, 3, 5, 2, 9, 1};

        insertionSortDesc(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
