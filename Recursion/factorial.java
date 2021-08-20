import java.util.*;

public class factorial {
    public static void main(String[] args) {
        System.out.println("Enter the number whose factorial you want to find.");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = fact(n);
        System.out.println("The factorial is " + fact);
        sc.close();
    }

    static int fact(int n) {
        if (n == 1)
            return 1;

        return n * fact(n - 1);
    }
}
