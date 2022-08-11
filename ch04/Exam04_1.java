package ch04;

import java.util.Scanner;

public class Exam04_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("x 입력: ");
        int x = scanner.nextInt();
        System.out.printf("n 입력: ");
        int n = scanner.nextInt();

        System.out.println(x + "의 " + n + "제곱: " + exponentiation(x, n));
    }

    private static int exponentiation(int x, int n) {
        if (n == 1) {
            return x;
        }
        return x * exponentiation(x, n - 1);
    }
}
