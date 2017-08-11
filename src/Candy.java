import java.util.Arrays;

public class Candy {

    int   scores[] = { 3, 5, 4, 3, 6, 8, 3, 15 };
    int   size;
    int[] candy;

    public Candy() {
        final int s = scores.length;
        candy = new int[s];
        for (int i = 0; i < s; i++) {
            candy[i] = 0;
        }
        size = s;
    }

    public static void main(String args[]) {
        final Candy c = new Candy();
        c.getDistribution();
        System.out.println(Arrays.toString(c.candy));
    }

    private void getDistribution() {
        candy[0] = 1;
        for (int i = 1; i < size; i++) {
            if (candy[i] == 0)
                candy[i] = 1;
            if (scores[i] > scores[i - 1])
                candy[i] = candy[i - 1] + 1;
        }
        for (int i = size - 1; i > 0; i--) {
            if (scores[i - 1] > scores[i])
                candy[i - 1] = candy[i] + 1;
        }
    }
}
