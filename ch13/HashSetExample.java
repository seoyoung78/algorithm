package ch13;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set set1 = new HashSet();
        Set<Integer> set2 = new HashSet<Integer>();
        Set<Integer> set3 = new HashSet<>();
        Set<String> set4 = new HashSet<>(5); // 초기 저장 용량 세팅
        Set<String> set5 = new HashSet<String>(){{ // 생성과 동시에 데이터 삽입
            add("computer");
            add("mouse");
            add("keyboard");
        }};

        Set<Integer> hashSet = new HashSet<>();

        int[] datas = {10, 20, 40, 50, 30, 60, 90, 80, 70, 100};
        for (int data : datas) {
            hashSet.add(data);
        }

        System.out.println("[HashSet의 데이터 삽입 후 결과]");
        System.out.println("    HashSet 결과: " + hashSet);
        System.out.println("");

        System.out.println("[데이터의 50의 존재 여부 확인]");
        if (hashSet.contains(50)) {
            System.out.println("데이터 50을 포함합니다.\n");
        } else {
            System.out.println("데이터 50을 포함하지 않습니다.\n");
        }

        System.out.println("데이터 삭제 전 hashSet 크기: " + hashSet.size());

        hashSet.remove(10);
        hashSet.remove(20);
        hashSet.remove(40);

        System.out.println("데이터 삭제 후 hashSet 크기: " + hashSet.size());
        System.out.println("");

        hashSet.clear();
        System.out.println("clear 메서드 호출 후 hashSet 크기: " + hashSet.size());
        System.out.println("");

        if (hashSet.isEmpty()) {
            System.out.println("데이터가 존재하지 않는 빈 hashSet입니다.");
        } else {
            System.out.println("데이터가 하나 이상 존재하는 hashSet입니다.");
        }
    }
}
