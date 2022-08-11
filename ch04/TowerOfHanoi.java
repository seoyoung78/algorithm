package ch04;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        System.out.println("원반의 개수를 입력해주세요.");
        Scanner scanner = new Scanner(System.in);
        int disks = scanner.nextInt();

        System.out.println("[결과]");
        topOfHanoin(disks, "A", "B", "C");
    }

    public static void topOfHanoin(int disks, String begin, String middle, String end) {
        if (disks == 1) {
            System.out.println(String.format("1번 원반을 %s 기둥으로 옮깁니다.", end));
            return;
        }

        topOfHanoin(disks - 1, begin, end, middle);
        System.out.println(String.format("%s번 원반을 %s 기둥으로 옮깁니다.", disks, end));
        topOfHanoin(disks - 1, middle, begin, end);

    }
}
