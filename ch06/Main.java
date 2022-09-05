package ch06;

public class Main {
    public static void main(String[] args) {
        /** binary tree
         *          5
         *       10     12
         *    13    9       2
         *  1
         */

        BinaryTree binaryTree = new BinaryTree();
        binaryTree.setRoot(new Node(5));

        Node node10 = new Node(10);
        Node node12 = new Node(12);
        Node node13 = new Node(13);
        Node node9 = new Node(9);
        Node node2 = new Node(2);
        Node node1 = new Node(1);

        binaryTree.getRoot().setLeftChild(node10);
        node10.setLeftChild(node13);
        node13.setLeftChild(node1);

        binaryTree.getRoot().setRightChild(node12);
        node12.setLeftChild(node9);
        node12.setRightChild(node2);

        // 완전 이진 트리
        CompleteBinaryTree completeBinaryTree = new CompleteBinaryTree();

        // 빈 노드는 -1로 대체
        int[] arr = new int[]{-1, 9, 7, 15, 4, 8, 11};
        completeBinaryTree.printAll(arr);

        /** binary tree 이진탐색트리
         *          13
         *      9       17
         *   7   11   14
         */

        BinarySearchTree binarySearchTree = new BinarySearchTree();
        Node root = new Node(13);
        binarySearchTree.setRoot(root);

        Node node9b = new Node(9);
        Node node17 = new Node(17);
        Node node7 = new Node(7);
        Node node11 = new Node(11);
        Node node14 = new Node(14);

        // 왼쪽 서브트리 생성
        binarySearchTree.getRoot().setLeftChild(node9b);
        node9b.setLeftChild(node7);
        node9b.setRightChild(node11);

        // 오른쪽 서브트리 생성
        binarySearchTree.getRoot().setRightChild(node17);
        node17.setLeftChild(node14);

        Node resultNode = binarySearchTree.search(binarySearchTree.getRoot(), 11);
        System.out.println("재귀호출을 이용한 검색 결과: " + resultNode.getValue());

        Node resultNode2 = binarySearchTree.search(14);
        System.out.println("반복문을 이용한 검색 결과: " + resultNode2.getValue());
    }
}
