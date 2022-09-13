package ch06;

public class MinHeapTree {
    private int[] heap;
    private int size;
    private int pointer;

    MinHeapTree(int size) {
        this.size = size;
        this.heap = new int[size + 1];
        // 자식 노드를 구하는 연산을 단순화시키기 위해서 0번지는 비워둠
        this.heap[0] = -1;
        this.pointer = 0;
    }

    /**
     *  부모의 인덱스 가져오기
     * @param index
     * @return
     */
    public int getParentIndex(int index) {
        // 인덱스가 1보다 작은 경우 계산x
        if (index < 1) {
            return -1;
        }
        return  index / 2;
    }

    /**
     * 왼쪽 자식읜 인덱스 가져오기
     * @param index
     * @return
     */
    public int getLeftChildIndex(int index) {
        // 인덱스가 1보다 작은 경우 계산x
        if (index < 1) {
            return -1;
        }
        return  index * 2;
    }

    /**
     * 오른쪽 자식의 인덱스 가져오기
     * @param index
     * @return
     */
    public int getRightChildIndex(int index) {
        // 인덱스가 1보다 작은 경우 계산x
        if (index < 1) {
            return -1;
        }
        return  (index * 2) + 1;
    }

    /**
     * 리프 노드 판별하기
     * @param index
     * @return
     */
    public boolean isLeafNode(int index) {
        return getLeftChildIndex(index) > size && getRightChildIndex(index) > size;
    }

    /**
     * 최솟값 가져오기
     */
    public int getRoot() {
        return heap[1];
    }

    /**
     * 스왑 메서드 - 힙트리의 삽입 또는 삭제 연산 시 두 노드 간의 위치 변경
     * @param cureentIndex
     * @param parentIndex
     */
    public void swap(int cureentIndex, int parentIndex) {
        int temp;
        temp = heap[cureentIndex];
        heap[cureentIndex] = heap[parentIndex];
        heap[parentIndex] = temp;
    }

    /**
     * 최소 힙 트리의 삽입
     * @param value
     */
    public void insert(int value) {
        heap[++pointer] = value;
        int currentIndex = pointer;

        while (heap[currentIndex] < heap[getParentIndex(currentIndex)]) {
            swap(currentIndex, getParentIndex(currentIndex));
            currentIndex = getParentIndex(currentIndex);
        }
    }

    /**
     * 최솟값을 반환하면서 삭제
     * @return
     */
    public int delete() {
        int result = getRoot();

        // 마지막 노드를 루트로 이동
        heap[1] = heap[size];
        heap[size] = -1;
        size--;

        if (size > 1) {
            rebuild(1);
        }

        return result;
    }

    /**
     * current index 인자 기준으로 heap 재구성
     * @param current
     */
    private void rebuild(int current) {
        // current index 기준으로 왼쪽 자식과 오른쪽 자식 중 작은 값 구함
        int leftChildIndex = getLeftChildIndex(current);
        int rightChildIndex = getRightChildIndex(current);

        if (isLeafNode(current)) {
            return;
        }

        // 왼쪽 자식만 존재하는 경우
        int swapIndex = current;
        if (rightChildIndex > size) {
            if (heap[leftChildIndex] < heap[current]) {
                swapIndex = leftChildIndex;
            }
        } else {
            // current index 기준으로 왼쪽 자식과 오른쪽 자식 중 작은 값을 구한다.
            if (heap[leftChildIndex] <= heap[rightChildIndex]) {
                swapIndex = leftChildIndex;
            } else {
                swapIndex = rightChildIndex;
            }
        }

        // current가 swap값 보다 크면 자리를 바꾼다.
        if (heap[current] > heap[swapIndex]) {
            swap(current, swapIndex);
            rebuild(swapIndex);
        }
    }

    /**
     * 모든 노드 출력하기
     */
    public void print() {
        for (int i = 1; i <= size; i++) {
            int parent = heap[i];
            int leftChild = 2 * i <= size ? heap[2 * i] : -1;
            int rightChild = (2 * i) + 1 <= size ? heap[(2 * i) + 1] : -1;

            if (leftChild > -1 && rightChild > -1) {
                System.out.println(String.format("부모: %s, 왼쪽 자식: %s, 오른쪽 자식: %s", parent, leftChild, rightChild));
            } else if (leftChild > -1 && rightChild == -1) {
                System.out.println(String.format("부모: %s, 왼쪽 자식: %s, 오른쪽 자식은 없습니다.", parent, leftChild));
            } else if (leftChild == -1 && rightChild > -1) {
                System.out.println(String.format("부모: %s, 왼쪽 자식은 없습니다. 오른쪽 자식: %s", parent, rightChild));
            } else {
                System.out.println(String.format("리프 노드: %s", parent));
            }
        }
    }
}
