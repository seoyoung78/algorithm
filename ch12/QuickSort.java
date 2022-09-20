package ch12;

public class QuickSort {
    public void quick(int[] arr, int left, int right) {
        if(left >= right) {
            return;
        }

        int l = left;
        int r = right;

        // 배열의 가운데 요소를 pivot으로 잡는다.
        int pivot = arr[(left + right) / 2];
        System.out.println(String.format("pivot의 값: %s", pivot));

        while (l < r) {
            // pivot의 좌측은 pivot보다 작은 값만 두고 큰 값을 찾는다.
            while (arr[l] < pivot) {
                l++;
            }

            // pivot의 우측은 pivot보다 큰 값만 두고 작은 값을 찾는다.
            while (arr[r] > pivot) {
                r--;
            }

            // l, r이 교차되면 분할을 멈춘다.
            if (l >= r) {
                break;
            }

            // l, r이 pivot과 같으면 l만 오른쪽으로 한칸 이동시킨다.
            if (arr[l] == pivot && arr[r] == pivot) {
                l++;
                continue;
            }

            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
        }

        // pivot 기준으로 좌, 우측 부분 리스트 정렬
        quick(arr, left, l - 1);
        quick(arr, l + 1, right);
    }
}
