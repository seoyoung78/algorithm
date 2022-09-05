package ch06;

public class BinarySearchTree {
    private Node root;

    public void setRoot(Node node) {
        this.root = node;
    }

    public Node getRoot() {
        return this.root;
    }

    private int getLeftNode(int[] arr, int index) {
        int findIndex = 2 * index;
        if (arr.length <= findIndex) {
            return -1;
        }
        return arr[findIndex];
    }

    private int getRightNode(int[] arr, int index) {
        int findIndex = (2 * index) + 1;
        if (arr.length <= findIndex) {
            return -1;
        }
        return arr[findIndex];
    }

    /**
     * 재귀 함수르 사용하는 방법
     * @param node
     * @param value
     * @return
     */
    public Node search(Node node, int value) {
        if (node == null) {
            return null;
        } else if (node.getValue() == value) {
            return node;
        } else if (node.getValue() > value) {
            return search(node.getLeftChilde(), value);
        } else {
            return search(node.getRightChild(), value);
        }
    }

    /**
     * 반복문을 사용하는 방법
     */
    public Node search(int value) {
        if (this.root == null) {
            return null;
        }

        Node target = this.root;
        while (target != null && target.getValue() != value) {
            if (target.getValue() > value) {
                target = target.getLeftChilde();
            } else {
                target = target.getRightChild();
            }
        }
        return target;
    }
}
