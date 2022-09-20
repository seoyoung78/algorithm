package ch12;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int[] arr = new int[]{26, 10, 35, 19, 7, 3, 12};

        System.out.println(String.format("초기 배열: %s", Arrays.toString(arr)));
        quickSort.quick(arr, 0, arr.length - 1);
        System.out.println("퀵 정렬 완료 후: " + Arrays.toString(arr));
    }
}
