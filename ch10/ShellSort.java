package ch10;

import java.util.Arrays;

public class ShellSort {
    public void sort(int[] arr) {
        int length = arr.length;

        System.out.println(String.format("초기 배열: %s \n", Arrays.toString(arr)));
        System.out.println("---");
        for (int gap = length / 2; gap > 0; gap /= 2) {
            System.out.println(String.format("간격은 %s(으)로 배열을 나눕니다.", gap));

            for (int startIndex = 0; startIndex < gap; startIndex++) {
                this.insertionSrotByGap(arr, gap, startIndex);
            }
        }
        System.out.println("---");
    }

    private void insertionSrotByGap(int[] arr, int gap, int startIndex) {
        for (int i = startIndex + gap; i < arr.length; i += gap) {
            int j;
            int temp = arr[i];

            for (j = i - gap; j >= 0 && arr[j] > temp; j -= gap) {
                arr[j + gap] = arr[j];
            }
            arr[j + gap] = temp;
        }
        System.out.println(String.format("정렬 진행 후 배열: %s \n", Arrays.toString(arr)));
    }
}
