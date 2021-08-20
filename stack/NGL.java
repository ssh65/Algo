
// To find the Nearest Greater to the left of an array 
import java.util.*;

public class NGL {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 7, 4, 5 };
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "");
        }
        System.out.println("The output is ");
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> out = new ArrayList<>();
        Ngl(arr, stack, out);
        out.forEach(System.out::println);

    }

    static void Ngl(int[] arr, Stack<Integer> stack, ArrayList<Integer> out) {
        for (int i = 0; i < arr.length; i++) {
            if (stack.size() == 0) {
                out.add(-1);
                stack.push(arr[i]);
            } else if (stack.peek() > arr[i]) {
                out.add(stack.peek());
                stack.push(arr[i]);
            } else if (stack.peek() < arr[i]) {
                while (stack.size() > 0 && stack.peek() < arr[i])
                    stack.pop();
                if (stack.size() == 0) {
                    stack.push(arr[i]);
                    out.add(-1);
                }
                if (stack.peek() > arr[i]) {
                    out.add(stack.peek());
                    stack.push(arr[i]);
                }
            }
        }
    }
}
