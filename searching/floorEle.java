import java.util.*;

public class floorEle {

    public static void main(String[] args) {
        int[] arr = { 3, 4, 7, 8, 11, 19, 21, 27 };
        int n = arr.length;
        System.out.println("The given array is");
        for (int element : arr)
            System.out.print(element + " ");
        System.out.println("");
        System.out.println("Enter the element to find its floor");
        Scanner sc = new Scanner(System.in);
        int ele = sc.nextInt();
        int floor = FEle(arr, 0, n - 1, ele);
        System.out.println("The floor element is " + arr[floor]);
        sc.close();
    }

    static int FEle(int[] arr, int low, int high, int ele) {
        if (low > high)
            return -1;

        if (ele > arr[high])
            return high;
        int mid = low + (high - low) / 2;
        if (arr[mid] == ele)
            return mid;

        if (mid > 0 && arr[mid - 1] <= ele && ele < arr[mid])
            return mid - 1;

        if (arr[mid] < ele) {
            return FEle(arr, mid + 1, high, ele);

        }
        return FEle(arr, low, mid - 1, ele);

    }
}
