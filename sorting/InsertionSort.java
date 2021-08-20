//Insertion sort
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 8, 4, 1, 5, 9, 2 };

        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = 0;
            for (j = i - 1; j >= 0 && arr[j] > temp; j--)
                arr[j + 1] = arr[j];

            arr[j + 1] = temp;
        }

        for (int element : arr)
            System.out.println(element);

    }
}
