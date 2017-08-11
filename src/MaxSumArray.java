
public class MaxSumArray {
    public static void main(String args[]) {
        final int[] arr = { -2, -3, 4, -4, -2, 1, 5, -3 };
        findMax(arr);
    }

    private static void findMax(int[] a) {
        if (a != null) {
            final int size = a.length;
            int m = a[0];
            int maxSoFar = a[0];
            for (int i = 1; i < size; i++) {
                m = max(a[i], a[i] + m);
                maxSoFar = max(m, maxSoFar);

            }
            System.out.println(maxSoFar);
        }

    }

    static int max(int a, int b) {
        return a > b ? a : b;
    }
}
