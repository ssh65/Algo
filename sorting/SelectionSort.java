public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 4, 1, 9, 2, 3, 6 };
        for (int i = 1; i <= arr.length; i++) {
            int j = i - 1;
            int min = j;
            for (; j < arr.length; j++)
                if (arr[j] < arr[min])
                    min = j;

            swap(arr, min, i - 1);
        }

        for (int element : arr)
            System.out.println(element);
    }

    static void swap(int[] arr, int j, int i) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
