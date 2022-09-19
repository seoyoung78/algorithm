package ch09;

public class InsertionSort {
    public int[] sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int target = arr[i];

            int j;
            for (j = i - 1; j >= 0 && arr[j] > target; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = target;
        }
        return arr;
    }
}
