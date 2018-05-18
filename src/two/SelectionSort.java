package two;

/**
 * 选择排序
 */
public class SelectionSort {

    /**
     * 选择排序
     * @param A
     */
    private void selectionSort(int[] A) {
        int n, small, i, j, temp;
        n = A.length;
        for (j = 0; j < n - 1; j++) {
            small = j;
            for (i = j + 1; i < n; i++) {
                if (A[i] < A[small]) {
                    small = i;
                }
            }
            temp = A[j];
            A[j] = A[small];
            A[small] = temp;
        }
    }

    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        int[] A = {3, 2, 4, 10, 8, 7};
        selectionSort.selectionSort(A);
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + ",");
        }
    }
}
