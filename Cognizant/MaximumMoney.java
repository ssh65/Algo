//Help Ryan make maximum money
package Cognizant;

public class MaximumMoney {
    public static void main(String[] args) {
        int[] arr = { 2, 8, -2, 28, 3 };
        int max = maxMoney(arr);
        System.out.println("The maximum amount of money is " + max);
    }

    static int maxMoney(int[] arr) {
        // Find max and min in the array
        int maxIndex = 1;
        int minIndex = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex])
                maxIndex = i;
            if (arr[i] < arr[minIndex])
                minIndex = i;
        }
        System.out.println("The max number is " + arr[maxIndex]);
        System.out.println("The min number is " + arr[minIndex]);
        // Now do the calculation
        swap(minIndex, 0, arr);
        int sum1 = 0;
        for (int j = 0; j < arr.length; j++)
            sum1 += arr[j] * (j + 1);

        swap(0, minIndex, arr);

        swap(maxIndex, arr.length - 1, arr);
        int sum2 = 0;
        for (int k = 0; k < arr.length; k++)
            sum2 += arr[k] * (k + 1);

        swap(arr.length - 1, maxIndex, arr);

        if (sum1 > sum2) {
            System.out.println("Move " + arr[minIndex] + " to first position");
            return sum1;
        } else {
            System.out.println("Move " + arr[maxIndex] + " to last position");
            return sum2;
        }

    }

    static void swap(int a, int b, int[] arr) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
