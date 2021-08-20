package SlidingWindow;

import java.util.*;

public class MinWindowSubstring {
    public static void main(String[] args) {
        String str = "ADOBECODEBANC";
        String ptr = "ABC";
        int minWindow = minWindowSub(str, ptr);
        System.out.println("The mininmum window substring is " + minWindow);
    }

    static int minWindowSub(String str, String ptr) {
        int i = 0;
        int j = 0;
        int min = Integer.MAX_VALUE;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        // Map ptr string
        for (int k = 0; k < ptr.length(); k++) {
            if (map.keySet().contains(ptr.charAt(k)))
                map.put(ptr.charAt(k), map.get(ptr.charAt(k)) + 1);
            else
                map.put(ptr.charAt(k), 1);
        }
        System.out.println("The mapping of ptr is " + map.entrySet());
        ArrayList<Character> key = new ArrayList<Character>(map.keySet());

        while (j < str.length()) {
            // calculations for j
            if (map.keySet().contains(str.charAt(j))) {
                System.out.println("The map contains " + str.charAt(j));
                map.put(str.charAt(j), map.get(str.charAt(j)) - 1);
                if (map.get(str.charAt(j)) == 0)
                    map.remove(str.charAt(j));
            } else {
                System.out.println("The map does not contain " + str.charAt(j));
                if (key.contains(str.charAt(j))) {
                    System.out.println("But real map contains " + str.charAt(j));
                    // incrementing i
                    if (key.contains(str.charAt(i))) {
                        map.put(str.charAt(i), 1);
                    }
                    System.out.println("The map is " + map.entrySet());
                    i++;
                    System.out.println("So new position of i is " + i);
                }
            }

            if (map.size() != 0) {
                j++;
            }

            if (map.size() == 0) {
                int currMin = j - i + 1;
                min = Math.min(currMin, min);
                System.out.println("The min till now is " + min);
                // incrementing i
                if (key.contains(str.charAt(i))) {
                    if (map.keySet().contains(str.charAt(i)))
                        map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
                    else
                        map.put(str.charAt(i), 1);
                }
                i++;
                j++;
            }

        }
        return min;
    }
}
