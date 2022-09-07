package ch06;

import ch05.LinkedListQueue;

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

    /**
     * 너비 우선 탐색 (Breadth First Search)
     * 큐를 이용하여 탐색
     * @param root
     */
    public void  bfs(Node root) {
        LinkedListQueue queue = new LinkedListQueue();
        queue.enqueue(root);

        while (!queue.empty()) {
            Node node = (Node) queue.dequeue();
            System.out.print(node.getValue() + " ");

            if (node.getLeftChilde() != null) {
                queue.enqueue(node.getLeftChilde());
            }

            if (node.getRightChild() != null) {
                queue.enqueue(node.getRightChild());
            }
        }
    }

    /**
     * 삽입
     * 1. 루트가 null인 경우
     * 2. 삽입할 값이 루트보다 작은 경우
     * 3. 삽일할 값이 루트보다 큰 경우
     */
    public void insert(int value) {
        if (this.root == null) {
            this.root = new Node(value);
            return;
        }

        Node target = this.root;
        Node parent = null;

        while (target != null) {
            parent = target;
            if (target.getValue() == value) {
                System.out.println(String.format("%s는(은) 중복된 값입니다. 삽입을 중단합니다.", value));
                break;
            }

            if (target.getValue() > value) {
                target = target.getLeftChilde();
                if (target == null) {
                    parent.setLeftChild(new Node(value));
                }
            } else {
                target = target.getRightChild();
                if (target == null) {
                    parent.setRightChild(new Node(value));
                }
            }
        }
    }

    /**
     * node 인자 기준으로 오른쪽 서브트리의 리프 노드 가져옴
     * @param node
     * @return
     */
    public Node getMinimumNode(Node node) {
        if (node == null) {
            return null;
        }

        if (node.getLeftChilde() != null) {
            return getMinimumNode(node.getLeftChilde());
        }

        return node;
    }

    /**
     * 삭제
     * @param value
     */
    public Node delete(Node root, int value) {
        if (root == null) {
            return null;
        }

        if (root.getValue() == value) {
            if (root.getLeftChilde() == null && root.getRightChild() == null) {
                // 자식 노드가 모두 없는 경우
                root = null;
                return null;
            } else if (root.getLeftChilde() != null && root.getRightChild() == null) {
                // 왼쪽 자식 노드만 존재하는 경우
                Node left = root.getLeftChilde();
                root = null;
                return left;
            } else if (root.getLeftChilde() == null && root.getRightChild() != null) {
                // 오른쪽 자식 노드만 존재하는 경우
                Node right = root.getRightChild();
                root = null;
                return right;
            } else {
                // 자식 노드가 2개인 경우
                Node children = getMinimumNode(root.getRightChild());
                root.setValue(children.getValue());
                root.setRightChild(delete(root.getRightChild(), children.getValue()));
            }
        }

        if (root.getValue() > value) {
            root.setLeftChild(delete(root.getLeftChilde(), value));
        } else {
            root.setRightChild(delete(root.getRightChild(), value));
        }
        return root;
    }
}
