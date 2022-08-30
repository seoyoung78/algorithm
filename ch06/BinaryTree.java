package ch06;

import ch05.LinkedListQueue;

public class BinaryTree {
    private Node root;

    public void setRoot(Node node) {
        this.root = node;
    }

    public Node getRoot() {
        return this.root;
    }

    /**
     * 너비 우선 탐색(Breadth-First Search)
     * 큐를 이용한 탐색 방법
     * @param root
     */
    public void bfs(Node root) {
        LinkedListQueue queue = new LinkedListQueue();
        queue.enqueue(root);

        while (!queue.empty()) {
            Node node = (Node) queue.dequeue();
            System.out.println(node.getValue() + " ");

            if (node.getLeftChilde() != null) {
                queue.enqueue(node.getLeftChilde());
            }

            if (node.getRightChild() != null) {
                queue.enqueue(node.getRightChild());
            }
        }
    }
}
