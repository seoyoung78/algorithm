package ch02;

public class Exam02_3 {
    public static void main(String[] args) {
        // 순서가 없는 두 배열에서 서로 같은 요소를 포함하는지 판별하는 메서드
        int[] arr1 = {1, 3, 2};
        int[] arr2 = {2, 3, 1};

        boolean check = false;

        for (int i : arr1) {
            boolean k = false;
            for (int j : arr2) {
                if (i == j) {
                    k = true;
                    break;
                }
            }
            if (!k) {
                check = true;
                break;
            }
        }

        if (check) {
            System.out.println("다른 배열입니다.");
        } else {
            System.out.println("같은 배열입니다.");
        }
    }
}
