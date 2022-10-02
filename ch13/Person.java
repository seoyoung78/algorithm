package ch13;

import java.text.NumberFormat;

public class Person {
    private BankBook bankBook;
    private String name;

    public Person(final BankBook bankBook, final String name) {
        this.bankBook = bankBook;
        this.name = name;
    }

//    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            bankBook.vector.add(i);
//            bankBook.arrayList.add(i);
        }
        System.out.println(String.format("입금자: %s || 총 금액: %s원\n", this.name, NumberFormat.getInstance().format(bankBook.getAmount())));
    }
}
