import java.util.*;

public class MaxAHistogram {
    public static void main(String[] args) {
        int[] arr = { 6, 2, 5, 4, 5, 1, 6 };
        System.out.println("The given histogram is ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println(" ");
        Stack<Integer> stack1 = new Stack<Integer>();
        ArrayList<Integer> out1 = new ArrayList<>();
        Stack<Integer> stack2 = new Stack<Integer>();
        ArrayList<Integer> out2 = new ArrayList<>();
        Nsl(arr, stack1, out1);
        Nsr(arr, stack2, out2);
        Collections.reverse(out2);
        System.out.println("The nsl of the elements are ");
        out1.forEach(System.out::print);
        System.out.println(" ");
        System.out.println("The nsr of the elements are ");
        out2.forEach(System.out::print);
        System.out.println(" ");
        int max = Integer.MIN_VALUE;
        for (int j = 0; j < out1.size(); j++) {
            int n1 = out1.get(j);
            int n2 = out2.get(j);
            int currmax = (n2 - n1 - 1) * arr[j];
            max = Math.max(max, currmax);
        }
        System.out.println("The maximum area of the histogram is " + max);
    }

    static void Nsl(int[] arr, Stack<Integer> stack, ArrayList<Integer> out) {
        for (int i = 0; i < arr.length; i++) {
            if (stack.size() == 0) {
                out.add(-1);
                stack.push(arr[i]);
            } else if (stack.peek() < arr[i]) {
                out.add(stack.peek());
                stack.push(arr[i]);
            } else if (stack.peek() >= arr[i]) {
                while (stack.size() > 0 && stack.peek() >= arr[i])
                    stack.pop();
                if (stack.size() == 0) {
                    stack.push(arr[i]);
                    out.add(-1);
                }
                if (stack.peek() < arr[i]) {
                    out.add(stack.peek());
                    stack.push(arr[i]);
                }
            }
        }
    }

    static void Nsr(int[] arr, Stack<Integer> stack, ArrayList<Integer> op) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (stack.size() == 0) {
                stack.push(arr[i]);
                op.add(-1);
            } else if (stack.peek() < arr[i]) {
                op.add(stack.peek());
                stack.push(arr[i]);
            } else if (stack.peek() >= arr[i]) {
                while (stack.size() > 0 && stack.peek() >= arr[i])
                    stack.pop();

                if (stack.size() == 0) {
                    stack.push(arr[i]);
                    op.add(-1);
                }
                if (stack.peek() < arr[i]) {
                    op.add(stack.peek());
                    stack.push(arr[i]);
                }
            }
        }
    }
}
