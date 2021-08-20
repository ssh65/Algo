public class arrayRotation2 {
    public static void main(String[] args) {
        int[] arr = { 15, 18, 2, 5, 6, 8, 11, 12 };
        int n = arr.length;
        int SE = SmallestEle(arr, 0, n - 1, n);
        System.out.println("The smallest element is at " + SE);
    }

    static int SmallestEle(int[] arr, int low, int high, int n) {
        int mid = low + (high - low) / 2;
        int prev = (mid + arr.length - 1) % arr.length;
        if (low > high)
            return -1;
        if (arr[mid] < arr[prev])
            return mid;
        if (arr[mid] >= arr[low] && arr[mid] <= arr[high])
            return low;

        if (arr[mid] >= arr[low])
            return SmallestEle(arr, mid + 1, high, n);

        return SmallestEle(arr, low, mid - 1, n);

    }

}
