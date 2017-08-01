
public class KsmallestEle {
    public static void findKSmallest(int[] A, int k) {
        randomPartitian(A, 4);
    }

    private static void randomPartitian(int[] a, int k) {
        final int size = a.length;
        final int pivot = a[size - 1];

        for (int i = 0; i < size; i++) {
            if (a[i] < pivot) {
                final int temp = a[i];
                a[size - 1] = a[i];
                a[i] = temp;
            }
            final int temp = a[i];
            a[size - 1] = a[i];
            a[i] = temp;
        }

        System.out.println(a);

    }

    public static void main(String args[]) {
        final int[] A = { 7, 10, 4, 3, 20, 15 };
        findKSmallest(A, 4);
    }

}
