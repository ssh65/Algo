package SlidingWindow;

import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        String str = "aabaabaa";
        String ptr = "aaba";
        System.out.println("The String is " + str);
        System.out.println("The pattern is " + ptr);
        int output = countAnagrams(str, ptr);
        System.out.println("The number of anagrams are " + output);
    }

    static int countAnagrams(String str, String ptr) {
        int windowSize = ptr.length();
        int count = 0;
        int ans = 0;
        int i = 0;
        int j = 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        // Code to make a map
        for (int k = 0; k < windowSize; k++) {
            if (map.keySet().contains(ptr.charAt(k)))
                map.put(ptr.charAt(k), map.get(ptr.charAt(k)) + 1);

            else {
                map.put(ptr.charAt(k), 1);
                count++;
            }

        }

        while (j < str.length()) {
            // decrease occurrence of str[j]
            if (map.keySet().contains(str.charAt(j))) {
                map.put(str.charAt(j), map.get(str.charAt(j)) - 1);
                if (map.get(str.charAt(j)) == 0) {
                    map.remove(str.charAt(j));
                    count--;
                }
            }
            // to reach window size
            if (j - i + 1 < windowSize) {
                j++;
            }
            // once window size is reached
            else if (j - i + 1 == windowSize) {
                if (count == 0)
                    ans++;

                // before incrementing i
                if (map.keySet().contains(str.charAt(i)))
                    map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
                else {
                    map.put(str.charAt(i), 1);
                    count++;
                }
                i++;
                j++;
            }
        }
        return ans;
    }
}
