package ch02;

import java.util.Scanner;

public class Exam02_5 {
    public static void main(String[] args) {
        // 소문자 알파벳을 입력받아 대문자로 출력
        Scanner scanner = new Scanner(System.in);


        while (true) {
            String str = scanner.next();
            System.out.println("입력문자: " + str);

            System.out.println("대문자 변환: " + str.toUpperCase());
        }
    }
}
