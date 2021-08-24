//Length of street covered with light
package Cognizant;

public class StreetLight {
    public static void main(String[] args) {
        int l = 2;
        int[][] array = { { 5, 10 }, { 4, 20 } };
        int output = streetLength(array, l);
        System.out.println("The street covered is " + output);
    }

    static int streetLength(int[][] array, int n) {
        int sum = 0;
        int diff = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + (array[i][1] - array[i][0]);
            if (i < n - 1) {
                if (array[i][1] > array[i + 1][1] && array[i][0] < array[i + 1][0])
                    diff = diff + (array[i + 1][1] - array[i + 1][0]);

                else if (array[i + 1][1] > array[i][1] && array[i][0] > array[i + 1][0])
                    diff = diff + (array[i][1] - array[i][0]);

                else if (array[i][1] > array[i + 1][0])
                    diff = diff + (array[i][1] - array[i + 1][0]);
            }
        }
        return sum - diff;
    }
}