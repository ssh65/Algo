
//Bubble Sort
public class BubbleS {
    public static void main(String[] args) {
        int[] arr = { 0, 4, 3, 7, 1, 5 };
        int n = arr.length;
        boolean change = true;
        for (int i = 1; i < n && change == true; i++) {
            System.out.println("This is " + i + " pass");
            change = false;
            // System.out.println("Change is false now " + change);
            for (int j = 0; j < n - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    change = true;
                }
            }
            for (int element : arr)
                System.out.println(element);
            System.out.println("The value of change is " + change);
        }

    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
