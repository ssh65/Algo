package heap;

import java.util.*;

public class TopKFrequentNum {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 3, 2, 2, 4 };
        int k = 3;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i]))
                map.put(arr[i], map.get(arr[i]) + 1);
            else
                map.put(arr[i], 1);
        }
        System.out.println("The map is " + map.entrySet());
        PriorityQueue<Pair<Integer, Integer>> pq = new PriorityQueue<Pair<Integer, Integer>>(k, (p1, p2) -> {
            if (p1.getElement0() == p2.getElement0())
                return p2.getElement1() - p1.getElement1(); // if both same, returns smaller number, so max heap
            else
                return p1.getElement0() - p2.getElement0(); // min heap
        });
        for (int i = 1; i <= map.size(); i++) {
            Pair<Integer, Integer> p = new Pair<Integer, Integer>(map.get(i), i);
            pq.add(p);
            System.out.println("The heap is " + pq.peek().getElement0() + "," + pq.peek().getElement1());
            if (pq.size() > k)
                pq.poll();
        }
        while (pq.size() != 0)
            System.out.println("The most frequent numbers are " + pq.poll().getElement1() + " ");
    }
}
