package ch05;

public class CircleArrayQueue {
    private Object arr[];
    private int MAX_QUEUE_SIZE;
    private int front = 0;
    private int rear = 0;

    CircleArrayQueue(int size) {
        this.MAX_QUEUE_SIZE = size + 1;
        this.arr = new Object[this.MAX_QUEUE_SIZE];
    }

    public void enquene(Object v) {
        if ((rear + 1) % MAX_QUEUE_SIZE == front) {
            throw new ArrayIndexOutOfBoundsException();
        }
        rear = (rear + 1) % MAX_QUEUE_SIZE;
        arr[rear] = v;
    }

    public Object dequeue() {
        if (empty()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        front = (front + 1) % MAX_QUEUE_SIZE;
        Object value = arr[front];
        arr[front] = null;

        return value;
    }

    public boolean empty() {
        return front == rear;
    }
}
