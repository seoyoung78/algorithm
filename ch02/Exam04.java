package ch02;

import java.util.Random;

public class Exam04 {
    public static void main(String[] args) {
        Random random = new Random();
        final int ARRAY_LENGTH = 10;

        int[] arr= new int[ARRAY_LENGTH];
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            boolean isPrimeNumber = true;
            int randomValue = random.nextInt(ARRAY_LENGTH); // 난수 생성

            if (randomValue == 1) {
                continue;
            }
            if (randomValue == 2) {
                arr[i] = randomValue;
                continue;
            }

            for (int j = 2; j < randomValue; j++) {
                if (randomValue % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }

            if (isPrimeNumber) {
                arr[i] = randomValue;
            }
        }

        System.out.println("[배열에 저장된 소수]");
        for (int k : arr) {
            if (k > 0) {
                System.out.println(k);
            }
        }
    }
}
