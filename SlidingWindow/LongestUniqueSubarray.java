package SlidingWindow;

import java.util.*;

public class LongestUniqueSubarray {
    public static void main(String[] args) {
        char[] arr = { 'a', 'b', 'c', 'd', 'a', 'b', 'd', 'e', 'c', 'a', 'b', 'f' };
        int ans = longestSubstringKUnique(arr);
        System.out.println("The longest unique substring is " + ans);
    }

    static int longestSubstringKUnique(char[] arr) {
        int i = 0;
        int j = 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int rep = 0;

        int maxSize = Integer.MIN_VALUE;

        while (j < arr.length) {
            if (map.keySet() == null)
                map.put(arr[j], 1);
            else {
                if (map.keySet().contains(arr[j])) {
                    map.put(arr[j], map.get(arr[j]) + 1);
                    rep++;
                } else
                    map.put(arr[j], 1);
            }
            if (rep > 0) {
                map.put(arr[i], map.get(arr[i]) - 1);
                if (map.get(arr[i]) == 0)
                    map.remove(arr[i]);
                if (map.keySet().contains(arr[i]))
                    rep--;
                i++;
                j++;
            } else {
                // increase j until we are getting the answer
                while (rep == 0 && j < arr.length) {
                    int size = j - i + 1;
                    maxSize = Math.max(maxSize, size);
                    j++;
                    if (j < arr.length) {
                        if (map.keySet().contains(arr[j])) {
                            map.put(arr[j], map.get(arr[j]) + 1);
                            rep++;
                        } else {
                            map.put(arr[j], 1);
                        }
                    }
                }
                // increment i and j
                map.put(arr[i], map.get(arr[i]) - 1);
                if (map.get(arr[i]) == 0)
                    map.remove(arr[i]);
                if (map.keySet().contains(arr[i]))
                    rep--;
                i++;
                j++;
            }
        }
        return maxSize;
    }
}
