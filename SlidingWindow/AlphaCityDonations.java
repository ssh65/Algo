package SlidingWindow;

public class AlphaCityDonations {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 3, 2, 1 };
        int output = maxDonation(arr);
        System.out.println("The output is " + output);
    }

    static int maxDonation(int[] arr) {
        int i = 0;
        int j = 1;
        int sum = arr[0];
        int maxSum = sum;
        while (j < arr.length && i < arr.length) {
            sum = sum + arr[j] - (arr[j] - arr[i]);
            System.out.println("The sum is " + sum);
            maxSum = Math.max(sum, maxSum);
            System.out.println("The max sum is " + maxSum);
            if (arr[j] >= sum)
                j++;

            else {
                sum = sum - arr[i];
                i++;
                j++;
            }
        }
        return maxSum;
    }
}
