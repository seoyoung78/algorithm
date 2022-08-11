package ch04;

public class Sum {
    public static void main(String[] args) {
        System.out.println("결과: " + sum(3));
    }

    private static int sum(int range) {
        if (range == 1) {
            return range;
        }
        return range + sum(range -1);
    }
}
