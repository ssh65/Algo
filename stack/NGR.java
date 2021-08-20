import java.util.*;

public class NGR {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 0, 0, 1, 2, 4 };
        System.out.println("The given array is ");
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
        Stack<Integer> stack = new Stack<Integer>();
        ArrayList<Integer> op = new ArrayList<Integer>();
        Ngr(arr, stack, op);
        Collections.reverse(op);
        System.out.println("The output is ");
        op.forEach(System.out::println);
    }

    static void Ngr(int[] arr, Stack<Integer> stack, ArrayList<Integer> op) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (stack.size() == 0) {
                stack.push(arr[i]);
                op.add(-1);
            } else if (stack.peek() > arr[i]) {
                op.add(stack.peek());
                stack.push(arr[i]);
            } else if (stack.peek() <= arr[i]) {
                while (stack.size() > 0 && stack.peek() <= arr[i])
                    stack.pop();

                if (stack.size() == 0) {
                    stack.push(arr[i]);
                    op.add(-1);
                }
                if (stack.peek() > arr[i]) {
                    op.add(stack.peek());
                    stack.push(arr[i]);
                }
            }
        }
    }
}
