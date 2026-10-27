public class Main {
    public static void main(String[] args) {
        quickSort sorter = new quickSort();

        int[] arr = sorter.generateRandomArray(1, 100, 10);

        // System.out.println("До сортування:");
        // quickSort.printArray(arr, arr.length);

        quickSort.quickSort(arr, 0, arr.length - 1, true);

        // System.out.println("Після сортування:");
        // quickSort.printArray(arr, arr.length);

        System.out.println(quickSort.isSorted(arr, true));
    }
}
