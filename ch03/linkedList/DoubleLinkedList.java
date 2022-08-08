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

    /**
     * 인자 값으로 앞 노드의 값을 알아내기
     * @param value
     * @return
     */
    public void printPrevNode(int value) {
        if (this.head == null) {
            System.out.println("이중 연결 리스트가 비어 있습니다.");
            return;
        }

        if (this.head.getValue() == value) {
            System.out.println(String.format("노드 %s 의 앞 노드는 존자하지 않습니다.", value));
            return;
        }

        Node pointer = this.head;
        while (pointer != null && pointer.getValue() != value) {
            pointer = pointer.next;
        }
        if (pointer == null) {
            System.out.println(String.format("노드 %s 은 존재하지 않습니다.", value));
        } else {
            System.out.println(String.format("노드 %s 의 앞 노드의 값은 %s 입니다.", value, pointer.prev.getValue()));
        }
    }

    /**
     * 모든 노드 출력
     */
    public void printAll() {
        Node pointer = this.head;

        StringBuilder builder = new StringBuilder();
        while (pointer != null) {
            builder.append(pointer.getValue());
            builder.append(" <-> ");
            pointer = pointer.next;
        }

        builder.delete(builder.lastIndexOf(" <-> "), builder.length());
        System.out.println(builder.toString());
    }

    /**
     * 노드의 값을 삭제
     * @param value
     */
    public void delete(int value) {
        Node pointer = this.head;

        if (pointer.getValue() == value) {
            Node removeNode = this.head;
            this.head = this.head.next;

            removeNode = null;
            return;
        }

        Node prevNode = pointer;
        while (pointer != null && pointer.getValue() != value) {
            prevNode = pointer;
            pointer = pointer.next;
        }

        Node temp = pointer.next;
        if (temp == null) {
            prevNode.next = null;
        } else {
            temp.prev = prevNode;
            prevNode.next = pointer;
        }

        pointer = null;
    }
}
