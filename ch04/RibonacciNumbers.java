package ch04;

import java.util.Scanner;

public class RibonacciNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("입력: ");

        int num = scanner.nextInt();
        System.out.printf("피보나치 수열: " );

        for (int i = 0; i < num; i++) {
            System.out.printf(fibonacci(i) + " ");
        }
    }

    private static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
