package two;

/**
 * 插入排序测试类
 */
public class InsertionSort {

    /**
     * 插入排序
     *
     * @param A
     */
    public void insertionSort(int[] A) {
        int key, j, i;
        for (j = 1; j < A.length; j++) {
            key = A[j];
            i = j - 1;
            while (i > -1 && A[i] < key) {
                A[i + 1] = A[i];
                i = i - 1;
            }
            A[i + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] A = {3, 1, 5, 6, 2, 4, 0};
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.insertionSort(A);
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]);
        }
    }
}



