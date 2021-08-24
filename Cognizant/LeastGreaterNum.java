package Cognizant;

import java.util.*;

public class LeastGreaterNum {
    static ArrayList<String> al = new ArrayList<String>();

    public static void main(String[] args) {
        String n1 = "453";
        String n2 = "368";
        String n3 = "178";
        leastGreaterNum(n1, n2, n3);
        Collections.sort(al);
        if (al.size() == 0)
            System.out.println("-1");
        else
            System.out.println("Output is " + al.get(0));
    }

    static void leastGreaterNum(String n1, String n2, String n3) {
        int a = Integer.parseInt(n1);
        int b = Integer.parseInt(n2);
        Integer[] arr = new Integer[n3.length()];
        for (int i = 0; i < arr.length; i++)
            arr[i] = Character.getNumericValue(n3.charAt(i));
        ArrayList<Integer> numCArr = new ArrayList<Integer>(Arrays.asList(arr));
        // Permutations of n3
        permutation(numCArr, a, b, 0);
    }

    static void permutation(ArrayList<Integer> numCArr, int a, int b, int k) {
        for (int i = k; i < numCArr.size(); i++) {
            Collections.swap(numCArr, i, k);
            permutation(numCArr, a, b, k + 1);
            Collections.swap(numCArr, k, i);
        }
        if (k == numCArr.size() - 1) {
            String sb = "";
            for (Integer s : numCArr)
                sb += s;
            if (Integer.parseInt(sb) > a && Integer.parseInt(sb) > b)
                al.add(sb);
        }

    }
}
