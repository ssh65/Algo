import java.util.*;

public class RainWaterTrapping {
    public static void main(String[] args) {
        int[] arr = { 3, 0, 0, 2, 0, 4 };
        int sum = 0;
        System.out.println("The given series is ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]);
        System.out.println("");
        ArrayList<Integer> gel = new ArrayList<>();
        ArrayList<Integer> ger = new ArrayList<>();
        ArrayList<Integer> wot = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (i == 0)
                gel.add(arr[i]);
            else if (arr[i] > gel.get(i - 1))
                gel.add(arr[i]);
            else if (arr[i] <= gel.get(i - 1))
                gel.add(gel.get(i - 1));
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            if (i == arr.length - 1)
                ger.add(arr[i]);
            else if (arr[i] > ger.get(arr.length - i - 2))
                ger.add(arr[i]);
            else if (arr[i] <= ger.get(arr.length - i - 2))
                ger.add(ger.get(arr.length - i - 2));
        }
        System.out.println("The Greatest Element on left are ");
        gel.forEach(System.out::print);
        System.out.println(" ");
        Collections.reverse(ger);
        System.out.println("The Greatest Element on right are ");
        ger.forEach(System.out::print);

        for (int j = 0; j < arr.length; j++)
            wot.add(j, Math.min(gel.get(j), ger.get(j)) - arr[j]);

        for (int ele : wot)
            sum += ele;

        System.out.println("");
        System.out.println("The sum is " + sum);
    }
}
