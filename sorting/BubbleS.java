
//Bubble Sort
public class BubbleS {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 5, 7 };
        int n = arr.length;
        boolean change = true;
        for (int i = 1; i < n && change; i++) {
            System.out.println("This is " + i + " pass");
            change = false;
            for (int j = 0; j < n - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    change = true;
                }
            }
        }
        for (int element : arr)
            System.out.println(element);
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
