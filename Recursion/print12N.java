
import java.util.Scanner;

public class print12N {
    public static void main(String[] args) {
        System.out.println("Enter the number will you want the print");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
        sc.close();
    }

    static void print(int n) {
        if (n <= 0)
            return;
        print(n - 1);
        System.out.print(n + " ");
    }
}
