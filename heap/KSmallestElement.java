package heap;

import java.util.*;

public class KSmallestElement {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        int[] arr = { 7, 10, 4, 3, 20, 15, 6 };
        int k = 3;
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
            if (pq.size() > k)
                pq.poll();
        }
        System.out.println("The kth Smallest element is " + pq.peek());
    }
}
