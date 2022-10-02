package ch13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List objectArrayList = new ArrayList();
        List<Integer> arrayIntegerList1 = new ArrayList<Integer>();
        List<Integer> arrayIntegerList2 = new ArrayList<>();
        List<String> arrayStringList1 = new ArrayList<>(5); // 초기 저장 용량 세팅
        List<String> arrayStringList2 = new ArrayList<String>(){{
            // 생성과 동시에 데이터 삽입
            add("APPLE");
            add("BANANA");
            add("GRAPE");
        }};

        System.out.println("[ArrayList에서 자주 사용되는 메서드를 사용해 봅시다.]\n");

        List<String> arrayList = new ArrayList<>();
        arrayList.add("사과");
        arrayList.add("배");
        arrayList.add("포도");
        arrayList.add("수박");
        arrayList.add("귤");
        arrayList.add("자두");
        arrayList.add("바나나");

        System.out.println("삭제 전 크기 : " + arrayList.size());

        System.out.println("arrayList에서 사과와 수박을 삭제합니다.");
        arrayList.remove("사과");
        arrayList.remove("수박");

        System.out.println("삭제 후 크기 : " + arrayList.size() + "\n");

        String findValue = "포도";
        boolean contains = arrayList.contains(findValue);
        if (contains) {
            System.out.println("arrayList에 " + findValue + "가(이) 존재합니다.");
        } else {
            System.out.println("arrayList에 " + findValue + "가(이) 존재하지 않습니다.");
        }

        System.out.println("0번째 인덱스의 값: " + arrayList.get(0) + "\n");

        System.out.println("Iterator를 이용한 ArrayList 모든 요소 출력");

        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());

            if (iterator.hasNext()) {
                System.out.print("->");
            }
        }

        System.out.println("\n");
        System.out.println("arrayList의 모든 요소를 삭제합니다.");
        arrayList.clear();
        System.out.println("삭제 후 크기 : " + arrayList.size());
    }
}
