package heap;

import java.util.*;

public class ConnectRopesMinimizeCost {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            queue.add(arr[i]);
            if (queue.size() >= 2) {
                int a = queue.poll();
                int b = queue.poll();
                queue.add(a + b);
            }
        }
        System.out.println("The minimum cost is " + queue.poll());
    }
}
