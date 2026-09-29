import java.util.Arrays;

public class Sorting {

    // Selection Sort
    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    // Insertion Sort
    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {

        int[] array1 = {64, 25, 12, 22, 11};
        int[] array2 = {64, 25, 12, 22, 11};

        selectionSort(array1);
        insertionSort(array2);

        System.out.println("Selection Sort: " + Arrays.toString(array1));
        System.out.println("Insertion Sort: " + Arrays.toString(array2));
    }
}
