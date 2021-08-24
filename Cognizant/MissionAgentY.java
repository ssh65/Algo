package Cognizant;

public class MissionAgentY {
    public static void main(String[] args) {
        int n = 2;
        int[][] arr = { { 0, 2 }, { 2, 1 } };
        int k = 4;
        int[][] matrix = new int[4][4];
        int num = noOfBuildings(n, arr, k, matrix);
        System.out.println("The number of buildings is " + num);
    }

    static int noOfBuildings(int n, int[][] arr, int k, int[][] matrix) {
        int b = 0;
        for (int i = 0; i < n; i++) {
            int r = arr[i][0];
            int c = arr[i][1];
            System.out.println("The value of row is " + r);
            System.out.println("The value of column is " + c);
            for (int j = 0; j <= k - 1; j++)
                if (matrix[r][j] != 1) {
                    System.out.println("Building at Position " + r + " , " + j + " will be covered.");
                    matrix[r][j] = 1;
                    b++;
                }

            for (int l = 0; l <= k - 1; l++)
                if (matrix[l][c] != 1) {
                    System.out.println("Building at Position " + l + " , " + c + " will be covered.");
                    matrix[l][c] = 1;
                    b++;
                }

        }
        return b;
    }
}
