import java.util.*;

public class SortArray {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2, 3, 7, 6, 4, 5, 9));
        sort(arr);
        for (int element : arr)
            System.out.println(element);
    }

    static void sort(ArrayList<Integer> arr) {
        if (arr.size() == 1)
            return;
        int temp = arr.get(arr.size() - 1);
        arr.remove(arr.size() - 1);
        sort(arr);
        insert(arr, temp);
    }

    static void insert(ArrayList<Integer> arr, int temp) {
        if (arr.get(arr.size() - 1) < temp || arr.size() == 0) {
            arr.add(temp);
            return;
        }
        int val = arr.get(arr.size() - 1);
        arr.remove(arr.size() - 1);
        insert(arr, temp);
        arr.add(val);
    }
}
