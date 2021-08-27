public class sorting {
    static int[] arr = { 4, 3, 1, 7, 5 };

    public static void main(String[] args) {
        System.out.println("The given array is ");
        for (int ele : arr)
            System.out.print(ele + " ");
        System.out.println("");
        int l = 0;
        int h = arr.length - 1;
        QuickSort(l, h);
        System.out.println("The sorted array is ");
        for (int ele : arr)
            System.out.print(ele + " ");
    }

    static void QuickSort(int l, int h) {
        if (l < h) {
            int pivot = Partition(l, h);
            QuickSort(l, pivot - 1);
            QuickSort(pivot + 1, h);
        }
    }

    static int Partition(int l, int h) {
        int pivot = arr[l];
        int i = l;
        int j = h;
        while (i < j) {
            while (arr[i] <= pivot && i < h)
                i++;
            while (arr[j] > pivot && j > l)
                j--;
            if (i < j)
                swap(arr, i, j);
        }
        swap(arr, l, j);
        return j;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
