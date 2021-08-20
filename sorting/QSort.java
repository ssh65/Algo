public class QSort {
    public static void main(String[] args) {
        int[] arr = { 7, 4, 1, 2, 8, 7, 5, 2, 5, 7 };
        int n = arr.length;
        QuickSort(arr, 0, n - 1);
        for (int element : arr)
            System.out.println(element);
    }

    static void QuickSort(int[] arr, int low, int high) {
        if (low < high) {
            int partition = partition(arr, low, high);
            QuickSort(arr, partition + 1, high);
            QuickSort(arr, low, partition - 1);
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;
        while (i < j) {
            while (arr[i] <= pivot)
                i++;

            while (arr[j] > pivot)
                j--;

            if (i < j)
                swap(arr, i, j);

        }
        swap(arr, low, j);
        return j;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
