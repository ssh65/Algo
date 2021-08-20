package SlidingWindow;

public class MaxSum {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 1, 8, 2, 9, 1 };
        int k = 3;
        int maxSum = maxSum(arr, k);
        System.out.println("The value of the maximum sum is " + maxSum);
    }

    static int maxSum(int[] arr, int k) {
        int i = 0;
        int j = 0;
        int currSum = 0;
        while (j - i + 1 <= k) {
            currSum += arr[j];
            j++;
        }
        j--;
        System.out.println("The current sum is " + currSum);
        System.out.println("The value of j is " + j);
        int maxsum = currSum;
        System.out.println("Now, window size has become " + (j - i + 1));
        while (j < arr.length - 1) {
            j++;
            currSum = currSum + arr[j] - arr[i];
            i++;
            maxsum = Math.max(currSum, maxsum);
        }
        return maxsum;
    }
}
