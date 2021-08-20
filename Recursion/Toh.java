import java.util.*;

public class Toh {
    public static void main(String[] args) {
        Stack<Integer> low = new Stack<Integer>();
        low.push(5);
        low.push(4);
        low.push(3);
        low.push(2);
        low.push(1);
        System.out.println("The low stack before is ");
        System.out.println(Arrays.toString(low.toArray()));
        int n = low.size();
        Stack<Integer> mid = new Stack<Integer>();
        Stack<Integer> high = new Stack<Integer>();
        System.out.println("------------------------The Operation-----------------------");
        TOH(low, mid, high, n);
        System.out.println("The low stack after is ");
        System.out.println(Arrays.toString(low.toArray()));
        System.out.println("The mid stack after is ");
        System.out.println(Arrays.toString(mid.toArray()));
        System.out.println("The high stack after is ");
        System.out.println(Arrays.toString(high.toArray()));
    }

    static void TOH(Stack<Integer> low, Stack<Integer> mid, Stack<Integer> high, int n) {
        if (n == 1) {
            int temp = low.pop();
            high.push(temp);
            return;
        }

        TOH(low, high, mid, n - 1);
        int val = low.pop();
        high.push(val);
        TOH(mid, low, high, n - 1);
    }
}
