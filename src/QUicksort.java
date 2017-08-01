
public class QUicksort {

    public static int sort(int[] A, int start, int end) {
        int pivot = 0;
        if (start < end) {
            pivot = partition(A, start, end);
            while (pivot != 3) {
                System.out.println(pivot);
                if (pivot < 3)
                    pivot = partition(A, pivot + 1, end);
                else
                    pivot = partition(A, start, pivot);
            }
        }
        return A[pivot];
    }

    private static int partition(int[] a, int start, int end) {
        int pIndex = start;
        final int pivot = end;
        int i = 0;
        for (i = start; i < end; i++)
            if (a[i] < a[pivot]) {
                swap(a, i, pIndex);
                pIndex++;
            }
        swap(a, pIndex, pivot);
        return pIndex;
    }

    private static void swap(int[] a, int i, int j) {
        final int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String args[]) {
        final int[] a = { 2, 3, 12, 9, 7, 6, 5 };
        //        sort(a, 0, 6);
        System.out.println(sort(a, 0, 6));
    }
}
