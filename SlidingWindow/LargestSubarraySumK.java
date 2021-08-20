package SlidingWindow;

public class LargestSubarraySumK {
    public static void main(String[] args) {
        int[] arr = { 4, 1, 1, 1, 2, 3, 5 };
        int sum = 5;
        int ans = largestSubarraySumK(arr, sum);
        System.out.println("The largest subarray is " + ans);
    }

    static int largestSubarraySumK(int[] arr, int sum) {
        int i = 0;
        int j = 0;
        int currSum = 0;
        int maxSize = Integer.MIN_VALUE;
        while (j < arr.length) {
            currSum = currSum + arr[j];

            if (currSum < sum)
                j++;
            else if (currSum > sum)
                i++;
            else {
                int size = j - i + 1;
                maxSize = Math.max(maxSize, size);
                currSum = currSum - arr[i];
                i++;
                j++;
            }
        }
        return maxSize;
    }
}
