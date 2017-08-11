import java.util.Arrays;

public class TrainPlatform {

    public static void main(String args[]) {
        final int[] source = { 900, 940, 950, 1100, 1500, 1800 };
        final int[] dep = { 910, 1200, 1120, 1130, 1900, 2000 };

        findPlatformCount(source, dep);
    }

    private static void findPlatformCount(int[] source, int[] dep) {
        Arrays.sort(source);
        Arrays.sort(dep);
        int plat_needed = 1;
        int result = 1;
        int i = 0;
        int j = 0;
        final int n = source.length;
        while (i < n && j < n) {
            if (source[i] < dep[j]) {
                plat_needed++;
                i++;
                if (plat_needed > result)
                    result = plat_needed;
            } else {
                plat_needed--;
                j++;
            }
        }
        System.out.println(plat_needed);
    }

}
