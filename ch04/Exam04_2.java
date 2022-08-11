package ch04;

public class Exam04_2 {
    public static void main(String[] args) {
        star(4);
    }

    private static void star(int n) {
        if (n <= 0) {
            return ;
        }
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
        star(n - 1);
    }
}
