package heap;

import java.util.*;

public class SumBwK1K2 {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 3, 7, 9, 6 };
        int k1 = 2;
        int k2 = 4;
        int sum = 0;
        PriorityQueue<Pair<Integer, Integer>> maxHeap = new PriorityQueue<Pair<Integer, Integer>>(k1, (p1, p2) -> {
            return p2.getElement0() - p1.getElement0();
        });
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Adding to heap " + arr[i] + " and index is " + i);
            maxHeap.add(new Pair<Integer, Integer>(arr[i], i));
            if (maxHeap.size() > k1)
                maxHeap.poll();
        }
        System.out.println("The k1 smallest element is " + maxHeap.peek().getElement0());
        System.out.println("The index of k1 smallest element is " + maxHeap.peek().getElement1());
        int k1i = maxHeap.peek().getElement1();
        maxHeap.clear();

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Adding to heap " + arr[i] + " and index is " + i);
            maxHeap.add(new Pair<Integer, Integer>(arr[i], i));
            if (maxHeap.size() > k2)
                maxHeap.poll();
        }
        System.out.println("The k2 smallest element is " + maxHeap.peek().getElement0());
        System.out.println("The index of k2 smallest element is " + maxHeap.peek().getElement1());
        int k2i = maxHeap.peek().getElement1();

        for (int j = k1i + 1; j < k2i; j++) {
            sum += arr[j];
        }
        System.out.println("The sum is " + sum);
    }
}
