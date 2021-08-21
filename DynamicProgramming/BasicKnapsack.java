package DynamicProgramming;

public class BasicKnapsack {
    public static void main(String[] args) {
        int[] wt = { 1, 3, 4, 5 };
        int[] val = { 1, 4, 5, 7 };
        int w = 7;
        int n = wt.length;
        int output = knapsack(wt, val, w, n);
        System.out.println("The output is " + output);
    }

    static int knapsack(int[] wt, int[] val, int w, int n) {
        if (n == 0 || w == 0)
            return 0;

        if (wt[n - 1] <= w)
            return Math.max(val[n - 1] + knapsack(wt, val, w - wt[n - 1], n - 1), knapsack(wt, val, w, n - 1));

        else
            return knapsack(wt, val, w, n - 1);
    }
}
