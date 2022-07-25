package ch02;

public class Exam02_2 {
    public static void main(String[] args) {
        // 배열의 최댓값과 최솟값을 구하는 메서드 작성
        int[] arr = {10, 11, 2, 5, 3, 3, 24, 15, 6, 9};

        int min = 100;
        int max = 0;

        for (int num : arr) {
            if (min > num) {
                min = num;
            }
            if (max < num) {
                max = num;
            }
        }

        System.out.println("최댓값: " + max);
        System.out.println("최솟값: " + min);
    }
}
