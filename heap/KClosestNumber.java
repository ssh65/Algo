package heap;

import java.util.*;

public class KClosestNumber {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 7, 8, 9 };
        int k = 3;
        PriorityQueue<Pair<Integer, Integer>> pq = new PriorityQueue<Pair<Integer, Integer>>(k, (p1, p2) -> {
            return p2.getElement0() - p1.getElement0(); // max heap
        });

        int x = 7;
        for (int i = 0; i < arr.length; i++) {
            pq.add(new Pair<>(Math.abs(arr[i] - x), arr[i]));
            System.out.println("We are adding " + new Pair<>(Math.abs(arr[i] - x), arr[i]));
            if (pq.size() > k) {
                System.out.println("Popping out the element " + pq.peek());
                pq.poll();
            }
        }
        System.out.println("The k closest numbers are ");
        while (pq.size() != 0)
            System.out.println(pq.poll().getElement1() + " ");
    }
}

class Pair<K, V> {

    private final K element0;
    private final V element1;

    public Pair<K, V> createPair(K element0, V element1) {
        return new Pair<K, V>(element0, element1);
    }

    public Pair(K element0, V element1) { // Constructor
        this.element0 = element0;
        this.element1 = element1;
    }

    public K getElement0() {
        return element0;
    }

    public V getElement1() {
        return element1;
    }
}
