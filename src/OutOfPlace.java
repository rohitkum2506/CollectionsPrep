
public class OutOfPlace {
    public static void reArrange(int[] a) {
        final int size = a.length;
        for (int i = 0; i < size; i++) {
            if (outOfPlaces(a, i)) {
                int j = 0;
                for (j = i; j < size; j++) {
                    if (a[j] * a[i] < 0) {
                        rightRotate(a, i, j);
                    }
                }
            }
        }
    }

    private static void rightRotate(int[] a, int i, int j) {
        while (i != j) {
            swap(a, i, j);
            i++;
        }
    }

    private static void swap(int[] a, int i, int j) {
        final int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private static boolean outOfPlaces(int[] a, int i) {
        return i % 2 != 0 && a[i] < 0;
    }

    public static void main(String args[]) {
        final int[] a = { 2, 4, -3, -4, 5 };
        reArrange(a);
    }
}
