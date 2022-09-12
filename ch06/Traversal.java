package ch06;

public class Traversal {
    public void preorder(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(" " + node.getValue());
        preorder(node.getLeftChilde());
        preorder(node.getRightChild());
    }

    public void inorder(Node node) {
        if (node == null) {
            return;
        }
        inorder(node.getLeftChilde());
        System.out.println(node.getValue());
        inorder(node.getRightChild());
    }

    public void postorder(Node node) {
        if (node == null) {
            return;
        }
        postorder(node.getLeftChilde());
        postorder(node.getRightChild());
        System.out.println(" " + node.getValue());
    }
}
