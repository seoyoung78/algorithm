package ch13;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class BankBook {
    public List<Integer> vector = new Vector<>(); // 동기화 보장
    public List<Integer> arrayList = new ArrayList<>(); // 동기화 보장x

    public int getAmount() {
        return this.vector.size();
    }
}
