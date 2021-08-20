package SlidingWindow;

import java.util.*;

public class LongestSubstringKUnique {
    public static void main(String[] args) {
        char[] arr = { 'a', 'a', 'b', 'a', 'c', 'b', 'e', 'b', 'd', 'b', 'e' };
        int k = 3;
        int ans = longestSubstringKUnique(arr, k);
        System.out.println("The longest substring is " + ans);
    }

    static int longestSubstringKUnique(char[] arr, int k) {
        int i = 0;
        int j = 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int currDist = 0;

        int maxSize = Integer.MIN_VALUE;

        while (j < arr.length) {

            if (map.keySet().contains(arr[j]))
                map.put(arr[j], map.get(arr[j]) + 1);
            else
                map.put(arr[j], 1);

            currDist = map.size();

            if (currDist < k)
                j++;

            else if (currDist > k) {
                map.put(arr[i], map.get(arr[i]) - 1);
                if (map.get(arr[i]) == 0)
                    map.remove(arr[i]);
                i++;
            }

            else {
                // increase j until we are getting the answer
                while (currDist == k && j < arr.length) {
                    int size = j - i + 1;
                    maxSize = Math.max(maxSize, size);
                    j++;
                    if (j < arr.length) {
                        if (map.keySet().contains(arr[j]))
                            map.put(arr[j], map.get(arr[j]) + 1);
                        else
                            map.put(arr[j], 1);
                    }

                    currDist = map.size();
                }
                // increment i and j
                map.put(arr[i], map.get(arr[i]) - 1);
                if (map.get(arr[i]) == 0)
                    map.remove(arr[i]);
                i++;
                j++;
            }
        }
        return maxSize;
    }
}
