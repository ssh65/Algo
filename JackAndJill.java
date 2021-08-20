import java.util.*;

public class JackAndJill {
    public static void main(String[] args) {
        int[] arr = {};
        int output = playTheGame(arr);
        System.out.println("The output is " + output);
        System.out.println("first its");

    }

    static int playTheGame(int[] arr) {
        Arrays.sort(arr);
        int steps = 0;
        if (arr.length > 0) {
            while (countzero(arr) != arr.length) {
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] % 2 == 1) { // arr[i] is odd
                        arr[i] -= 1;
                        steps++;
                    }
                }
                // now everyone has become divisible by 2

                for (int i = 0; i < arr.length; i++)
                    arr[i] /= 2;

                steps++;
            }
            return steps - 1;
        } else
            return steps;
    }

    static int countzero(int[] arr) {
        int count = 0;
        for (int ele : arr)
            if (ele == 0)
                count++;
        return count;
    }
}
