package DynamicProgramming;

public class BasicKnapsackBottomUp {
    public static void main(String[] args) {
        int[] wt = { 1, 3, 4, 5 };
        int[] val = { 1, 4, 5, 7 };
        int w = 7;
        int n = wt.length;
        int[][] t = new int[n + 1][w + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= w; j++) {
                if (i == 0 || j == 0)
                    t[i][j] = 0;
                else
                    t[i][j] = -1;
            }
        }
        int output = knapsack(wt, val, w, n, t);
        System.out.println("The output is " + output);
    }

    static int knapsack(int[] wt, int[] val, int w, int n, int[][] t) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= w; j++) {
                if (wt[i - 1] <= j)
                    t[i][j] = Math.max(val[i - 1] + t[i - 1][j - wt[i - 1]], t[i - 1][j]);

                else
                    t[i][j] = t[i - 1][j];
            }
        }
        return t[n][w];
    }
}
