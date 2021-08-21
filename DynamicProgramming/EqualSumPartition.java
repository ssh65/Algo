package DynamicProgramming;

public class EqualSumPartition {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 5 };
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum = sum + arr[i];
        boolean[][] t = new boolean[n + 1][sum + 1];
        if (sum % 2 != 0)
            System.out.println("The output is false");
        else
            System.out.println("The output is " + SubsetSumProblem.knapsack(arr, sum / 2, n, t));
    }

}
