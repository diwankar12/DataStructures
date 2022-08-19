package Gfg.Sorting;

public class MergeSort {


    public static void main(String[] args) {
        int[] a = new int[]{10, 5, 30, 15, 7};
        int l = 0, r = 4;
        mergeSort(a, l, r);
        for (int x : a)
            System.out.print(x + " ");
    }

    public static void mergeSort(int[] arr, int l, int r) {
        if (r > l) {
            int m = l + (r - l) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(m, l, r, arr);
        }
    }

    //
    public static void merge(int m, int l, int r, int[] arr) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        for (int i = 0; i < leftArr.length; i++) {
            leftArr[i] = arr[l + i];
        }

        for (int i = 0; i < rightArr.length; i++) {
            rightArr[i] = arr[m + i + 1];
        }

        int i = 0;
        int j = 0;
        int k = l;

        while (i < n1 && j < n2) {

            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
                k++;
            } else {
                arr[k] = rightArr[j];
                k++;
                j++;
            }
        }
        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
}
