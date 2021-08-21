package DynamicProgramming;

public class SubsetSumProblem {
    static int[] arr = { 2, 3, 7, 8, 10 };
    static int sum = 5;
    static int n = arr.length;
    static boolean[][] t = new boolean[n + 1][sum + 1];

    public static void main(String[] args) {

        boolean output = knapsack(arr, sum, n, t);
        System.out.println("The output is " + output);

    }

    static boolean knapsack(int[] arr, int sum, int n, boolean[][] t) {
        t[0][0] = true;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                if (j == 0 && i != 0)
                    t[i][j] = true;
                else if (i == 0 && j != 0)
                    t[i][j] = false;
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                if (arr[i - 1] <= j)
                    t[i][j] = (t[i - 1][j - arr[i - 1]] || t[i - 1][j]);

                else
                    t[i][j] = t[i - 1][j];
            }
        }
        return t[n][sum];
    }
}
