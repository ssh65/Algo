import java.util.Scanner;

public class ceilEle {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 7, 8, 11, 19, 21, 35, 42 };
        int n = arr.length;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element whose ceil you want to find out?");
        int ele = sc.nextInt();
        int ceil = CeilEle(arr, 0, n - 1, ele);
        System.out.println("The ceil of the element is " + arr[ceil]);
        sc.close();
    }

    static int CeilEle(int arr[], int low, int high, int ele) {
        int mid = low + (high - low) / 2;

        if (low > high)
            return -1;

        if (arr[mid] == ele)
            return arr[mid];

        if (arr[mid] > ele && arr[mid - 1] < ele)
            return mid;

        if (arr[mid] > ele)
            return CeilEle(arr, low, mid - 1, ele);

        return CeilEle(arr, mid + 1, high, ele);
    }
}
