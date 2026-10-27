import java.util.Random;

public class quickSort {

    public int[] generateRandomArray(int min, int max, int length) {
        Random random = new Random();
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
        return array;
    }

    static void swapElements(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partitionArray(int[] arr, int start, int end, boolean direction) {
        int pivot = arr[end];
        int i = start - 1;

        for (int j = start; j < end; j++) {
            if (direction ? arr[j] < pivot : arr[j] > pivot) {
                i++;
                swapElements(arr, i, j);
            }
        }
        swapElements(arr, i + 1, end);
        return i + 1;
    }

    static void quickSort(int[] arr, int low, int high, boolean direction) {
        if (low < high) {
            int pivotIndex = partitionArray(arr, low, high, direction);

            quickSort(arr, low, pivotIndex - 1, direction);
            quickSort(arr, pivotIndex + 1, high, direction);
        }
    }

    static void printArray(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    static boolean isSorted(int[] arr, boolean direction) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (direction && arr[i] > arr[i + 1]) {
                return false;
            }

            if (!direction && arr[i] < arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
