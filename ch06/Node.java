package ch06;

public class Node {
    private int value;
    private Node left;
    private Node right;

    Node (int value) {
        this.value = value;
    }

    public Node (int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public void setLeftChild (Node node) {
        this.left = node;
    }

    public Node getLeftChilde () {
        return this.left;
    }

    public void setRightChild (Node node) {
        this.right = node;
    }

    public Node getRightChild () {
        return this.right;
    }

    public int getValue () {
        return this.value;
    }
}
