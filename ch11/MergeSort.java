package ch11;

public class MergeSort {
    private void mergeSort(int[] arr, int start, int div, int end) {
        int[] temp = new int[arr.length];

        int s = start;
        int r = div + 1;
        int k = start; // 배열에 복사할 위치 인덱스

        while (s <= div && r <= end) {
            if (arr[s] <= arr[r]) {
                temp[k++] = arr[s++];
            } else {
                temp[k++] = arr[r++];
            }
        }

        // 앞쪽
        while (s <= div) {
            temp[k++] = arr[s++];
        }

        // 뒤쪽
        while (r <= end) {
            temp[k++] = arr[r++];
        }

        for (int h = 0; h <= end - start; h++) {
            arr[start + h] = temp[start + h];
        }
    }

    public void merge(int arr[], int left, int right) {
        // 하나가 남을 때까지
        if (left < right) {
            int div = (left + right) / 2;
            merge(arr, left, div);
            merge(arr, div + 1, right);
            mergeSort(arr, left, div, right);
        }
    }
}
