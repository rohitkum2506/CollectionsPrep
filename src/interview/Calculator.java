package interview;

public class Calculator {
    public Calculator() {

    }

    public String Add(String string) {
        String res = String.valueOf(0);
        if (string != null) {
            if (string.length() == 0) {
                res = res;
            }
        }
        return res;
    }
}
