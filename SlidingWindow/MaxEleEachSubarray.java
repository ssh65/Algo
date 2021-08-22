package SlidingWindow;

import java.util.*;

public class MaxEleEachSubarray {
    public static void main(String[] args) {
        int[] arr = { 1, 3, -1, -1, 5, 3, 6, 7 };
        int k = 3;
        maxSumSubarray(arr, k);
    }

    static void maxSumSubarray(int[] arr, int k) {
        int i = 0;
        int j = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (j < arr.length) {
            if (list.size() == 0)
                list.add(arr[j]);
            else if (arr[j] >= list.get(0)) {
                list.clear();
                list.add(arr[j]);
            } else {
                list.add(arr[j]);
            }

            if (j - i + 1 < k)
                j++;

            if (j - i + 1 == k) {
                System.out.print(list.get(0) + " ");

                if (arr[i] == list.get(0))
                    list.remove(0);
                i++;
                j++;
            }
        }
    }
}
