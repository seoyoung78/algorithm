package ch07;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();

        int[] arr = new int[]{8, 2, 14, 7, 5};
        bubbleSort.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
