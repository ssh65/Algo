//Count the visible clothes
package Cognizant;

public class VisibleClothes {
    public static void main(String[] args) {
        int n = 10;
        int c = 4;
        int[][] arr = { { 0, 3 }, { 2, 4 }, { 2, 7 }, { 7, 9 } };
        int output = visible(n, c, arr);
        System.out.println("The output is " + output);
    }

    static int visible(int n, int c, int[][] arr) {
        int count = 0;
        for (int i = 0; i < c - 1; i++) {
            count++;
            int length = arr[i][1] - arr[i][0];
            if (arr[i + 1][0] <= arr[i][0] && arr[i + 1][1] >= arr[i][1]) {
                System.out.println("The clothes completely cover");
                length = 0;
            } else if (arr[i + 1][0] < arr[i][1]) {
                System.out.println("The clothes are overlapping");
                length = length - (arr[i][1] - arr[i + 1][0]);
            }
            if (length <= 0)
                count--;
        }
        return count;
    }
}
