package DynamicProgramming;

public class MinSubsetSumDifference {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 7 };
        int sum = 10;
        int n = arr.length;
        int s = -1;
        boolean[][] t = new boolean[n + 1][sum + 1];
        SubsetSumProblem.knapsack(arr, sum, n, t);
        for (int i = 0; i <= sum/2; i++)
            if (t[n][i] == true)
                s++;
        System.out.println("The value of s is " + s);
        int min = (sum - s) - s;
        System.out.println("The min difference is " + min);
    }

}
