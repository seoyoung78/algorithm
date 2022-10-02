package ch13;

public class BasicArrayListExample {
    public static void main(String[] args) {
        BasicArrayList basicArrayList = new BasicArrayList();

        // int 타입의 값 삽입
        basicArrayList.add(1);

        // String 타입의 값 삽입
        basicArrayList.add("test");

        System.out.println("basicArrayList의 크기: " + basicArrayList.size());

        int intTypeValue = (int) basicArrayList.getValue(0);
        System.out.println("int 타입의 값: " + intTypeValue);

        String stringTypeValue = (String) basicArrayList.getValue(1);
        System.out.println("String 타입의 값: " + stringTypeValue);
    }
}
