import java.util.Scanner;

public class FLOccur {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 10, 10, 10, 18, 20 };
        int n = arr.length;
        Scanner sc = new Scanner(System.in);
        System.out.println("Find first and last occurrences of which element?");
        int ele = sc.nextInt();
        int fOccur = BinarySearchF(arr, ele, 0, n - 1);
        int lOccur = BinarySearchL(arr, ele, 0, n - 1);
        System.out.println("The first occurrence is at " + fOccur);
        System.out.println("The last occurrence is at " + lOccur);
        sc.close();
    }

    static int BinarySearchF(int[] arr, int ele, int low, int high) {
        int mid = low + (high - low) / 2;

        if (low > high)
            return -1;

        if (arr[mid] == ele && arr[mid - 1] < ele)
            return mid;

        if (arr[mid] == ele)
            return BinarySearchF(arr, ele, 0, mid - 1);

        if (arr[mid] < ele)
            return BinarySearchF(arr, ele, mid + 1, high);

        return BinarySearchF(arr, ele, 0, mid - 1);

    }

    static int BinarySearchL(int[] arr, int ele, int low, int high) {
        int mid = low + (high - low) / 2;

        if (low > high)
            return -1;

        if (arr[mid] == ele && arr[mid + 1] > ele)
            return mid;

        if (arr[mid] == ele)
            return BinarySearchL(arr, ele, mid + 1, high);

        if (arr[mid] < ele)
            return BinarySearchL(arr, ele, mid + 1, high);

        return BinarySearchL(arr, ele, low, mid - 1);

    }

}
