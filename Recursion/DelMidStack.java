import java.util.*;

public class DelMidStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(Arrays.toString(stack.toArray()));
        // stack.forEach(System.out::print);
        int size = stack.size();
        DelMid(stack, (size) / 2 + 1);
        System.out.println(" ");
        // stack.forEach(System.out::print);
        System.out.println(Arrays.toString(stack.toArray()));
    }

    static void DelMid(Stack<Integer> stack, int k) {

        if (k == 1) {
            stack.pop();
            return;
        }

        int temp = stack.pop();
        DelMid(stack, k - 1);
        stack.push(temp);

    }
}
