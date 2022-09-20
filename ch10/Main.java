package ch10;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ShellSort sort = new ShellSort();
        int[] arr = new int[]{32, 29, 15, 20, 41, 10, 30, 22, 1};

        sort.sort(arr);
        System.out.println("셸 정렬 완료 후: " + Arrays.toString(arr));
    }
}
