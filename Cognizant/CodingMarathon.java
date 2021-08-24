package Cognizant;

import java.util.*;

class GFG {

    public static int FirstKelements(int arr[], int size, int k) {
        int sum = 0;

        // Creating Min Heap for given
        // array with only k elements
        // Create min heap with priority queue
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            minHeap.add(arr[i]);
        }

        // Loop For each element in array
        // after the kth element
        for (int i = k; i < size; i++) {

            // If current element is smaller
            // than minimum ((top element of
            // the minHeap) element, do nothing
            // and continue to next element
            if (minHeap.peek() > arr[i])
                continue;

            // Otherwise Change minimum element
            // (top element of the minHeap) to
            // current element by polling out
            // the top element of the minHeap
            else {
                minHeap.poll();
                minHeap.add(arr[i]);
            }
        }

        // Now min heap contains k maximum
        // elements, Iterate and print
        Iterator<Integer> iterator = minHeap.iterator();

        while (iterator.hasNext()) {
            sum += (int) iterator.next();
        }
        return sum;
    }

    // Driver code
    public static void main(String[] args) {
        int arr[] = { 4, 3, 6, 1 };

        int size = arr.length;

        // Size of Min Heap
        int k = 3;

        int output = FirstKelements(arr, size, k);
        System.out.println("The output is " + output);
    }
}

// This code is contributed by Vansh Sethi