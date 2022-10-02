package ch13;

public class StringArrayList {
    private String[] array = new String[10];
    private int index = 0;

    public void add(String value) {
        this.array[index++] = value;
    }

    public String getValue(int index) {
        return this.array[index];
    }

    public int size() {
        return this.array.length;
    }
}
