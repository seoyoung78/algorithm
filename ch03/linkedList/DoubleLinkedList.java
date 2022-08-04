package ch03.linkedList;

public class DoubleLinkedList {
    private Node head;

    DoubleLinkedList() {
        this.head = null;
    }

    DoubleLinkedList(int value, Node heaad) {
        this.head = new Node(value, head, null);
    }

    class Node {
        private int value; // 값
        private Node prev; // 이전포인터
        private Node next; // 다음 포인터

        Node(int value) {
            this.value = value;
            this.prev = null;
            this.next = null;
        }

        Node(int value, Node prev, Node next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }

        public int getValue() {
            return this.value;
        }
    }

    public Node getHead(){
        return this.head;
    }

    /**
     * 이중 연결 리스트 끝에 노드 추가
     * @param value
     */
    public void append(int value) {
        if (this.head == null) {
            this.head = new Node(value);
            return;
        }

        Node pointer = this.head;
        while (pointer.next != null) {
            pointer = pointer.next;
        }

        Node newNode = new Node(value);
        newNode.prev = pointer;
        pointer.next = newNode;
    }


}
