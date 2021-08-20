import java.util.*;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("The given stack is - ");
        System.out.println(Arrays.toString((stack).toArray()));
        Reverse(stack);
        System.out.println("The reversed stack is - ");
        System.out.println(Arrays.toString((stack).toArray()));
    }

    static void Reverse(Stack<Integer> stack) {
        // System.out.println("This is a reverse");

        if (stack.size() == 1)
            return;

        int temp = stack.pop();
        Reverse(stack);
        Insert(stack, temp);
    }

    static void Insert(Stack<Integer> stack, int temp) {
        // System.out.println("This is insert");

        if (stack.size() == 0) {
            stack.push(temp);
            return;
        }

        int val = stack.pop();
        Insert(stack, temp);
        stack.push(val);
    }
}