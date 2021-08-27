package heap;

import java.util.*;

public class SortKSorted {
    public static void main(String[] args) {
        int[] arr = { 6, 5, 3, 2, 8, 10, 9 };
        int k = 3;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            System.out.println("adding " + arr[i]);
            pq.add(arr[i]);
            if (pq.size() > k) {
                System.out.println("Adding " + pq.peek() + " to array");
                al.add(pq.poll());
            }
        }
        while (pq.size() != 0)
            al.add(pq.poll());
        System.out.println(al);
    }
}
