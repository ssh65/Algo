import java.util.Scanner;

public class BinaryS {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 8, 9, 13, 17 };
        System.out.println("Enter the element you want to search.");
        Scanner sc = new Scanner(System.in);
        int ele = sc.nextInt();
        BinarySearch(arr, 0, 6, ele);
        sc.close();
    }

    static void BinarySearch(int[] arr, int start, int end, int ele) {
        int mid = start + (end - start) / 2;
        if (arr[mid] == ele)
            System.out.println("Element found at " + mid);

        else if (arr[mid] < ele)
            BinarySearch(arr, mid + 1, end, ele);

        else
            BinarySearch(arr, 0, mid - 1, ele);
    }
}
