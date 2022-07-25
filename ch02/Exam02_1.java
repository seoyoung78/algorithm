package ch02;

import java.util.Scanner;

public class Exam02_1 {
    public static void main(String[] args) {
        // 5개의 양수를 입력받은 배열의 모든 요소의 합 구하는 메서드
        int[] arr = new int[5];
        int sum = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int num : arr) {
            sum += num;
        }

        System.out.println("최종 출력값 : " + sum);
    }
}