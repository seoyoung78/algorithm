package ch13;

public class Main {
    public static void main(String[] args) {
        BankBook bankBook = new BankBook();

        // Thread 클래스를 상속받은 Person 클래스 3개를 만들어서 호출
        for (int i = 0; i < 3; i++) {
            String name = "Person" + i;
            new Person(bankBook, name).run();
        }
    }
}
