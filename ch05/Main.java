package ch05;

public class Main {
    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack(3);
        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(3);

        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.empty());

        LinkedList stack = new LinkedList();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        ArrayQueue arrayQueue = new ArrayQueue(5);
        arrayQueue.enqueue(1000);
        arrayQueue.enqueue(2000);
        arrayQueue.enqueue(3000);
        arrayQueue.enqueue(4000);
        arrayQueue.enqueue(5000);

        System.out.println(arrayQueue.dequeue());
        System.out.println(arrayQueue.dequeue());
        System.out.println(arrayQueue.dequeue());
        System.out.println(arrayQueue.dequeue());
        System.out.println(arrayQueue.dequeue());
        System.out.println(arrayQueue.isFull());

        LinkedListQueue queue = new LinkedListQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        System.out.println(String.format("첫 번째 값을 가져옵니다. => %s", queue.dequeue()));
        System.out.println(String.format("두 번째 값을 가져옵니다. => %s", queue.dequeue()));
        System.out.println(String.format("세 번째 값을 가져옵니다. => %s", queue.dequeue()));
        System.out.println("------");
        System.out.println(String.format("큐의 현재 값입니다 => %s", queue.peek()));
        System.out.println("------");
        System.out.println(String.format("네 번째 값을 가져옵니다. => %s", queue.dequeue()));
        System.out.println(String.format("다섯 번째 값을 가져옵니다. => %s", queue.dequeue()));

        if (queue.empty()) {
            System.out.println("------");
            System.out.println("큐가 비어있습니다.");
        }

        CircleArrayQueue queue1 = new CircleArrayQueue(5);
        queue1.enquene("사과");
        queue1.enquene("바나나");
        queue1.enquene("딸기");
        queue1.enquene("귤");
        queue1.enquene("배");

        System.out.println(String.format("첫 번째 값을 가벼옵니다 => %s", queue1.dequeue()));
        System.out.println(String.format("두 번째 값을 가벼옵니다 => %s", queue1.dequeue()));
        System.out.println(String.format("세 번째 값을 가벼옵니다 => %s", queue1.dequeue()));
        System.out.println(String.format("네 번째 값을 가벼옵니다 => %s", queue1.dequeue()));
        System.out.println(String.format("다섯 번째 값을 가벼옵니다 => %s", queue1.dequeue()));
        System.out.println("");
        System.out.println("--- 운형 큐이므로 가용 공간을 재사용할 수 있다.");
        queue1.enquene("체리");
        System.out.println(String.format("첫 번째 값을 가벼옵니다 => %s", queue1.dequeue()));

        if (queue1.empty()) {
            System.out.println("---");
            System.out.println("큐가 비어있습니다.");
        }

        LinkedListDeque deque = new LinkedListDeque();

        deque.adFirst("100");
        deque.addLast("200");
        deque.adFirst("300");
        deque.addLast("400");
        deque.adFirst("500");
        deque.addLast("600");
        deque.adFirst("700");
        System.out.println(String.format("삽입 후: %s", deque.print()));

        deque.removeFirst();
        deque.removeLast();
        System.out.println(String.format("삭제 후: %s", deque.print()));
    }
}
