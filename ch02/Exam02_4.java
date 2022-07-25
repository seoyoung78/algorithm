package ch02;

import java.util.Arrays;

public class Exam02_4 {
    public static void main(String[] args) {
        // 중복된 요소 제거한 새 배열 반환
        int[] arr = {5, 10, 9, 27, 2, 8, 10, 4, 27, 1};
        int[] result = new int[10];

        result = arr.clone();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length && j != i; j++) {
                if (result[i] == arr[j] && result[i] != 0) {
                    result[j] = 0;
                }
            }
        }

        for (int res : result) {
            System.out.println(res);
        }
    }
}
