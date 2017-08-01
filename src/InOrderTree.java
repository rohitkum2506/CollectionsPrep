import java.util.ArrayList;
import java.util.List;

public class InOrderTree {

    public static void main(String args[]) {
        final Node n = new Node(3);

        final Node n1 = new Node(5);
        final Node n2 = new Node(15);
        n.setLeft(n1);
        n.setRight(n2);

        final Node n3 = new Node(25);
        final Node n4 = new Node(35);
        n1.setLeft(n3);
        n1.setRight(new Node(4));
        n3.setLeft(n4);
        n3.setRight(new Node(-16));

        final Node n5 = new Node(50);
        final Node n6 = new Node(55);
        n2.setLeft(n5);
        n2.setRight(n6);
        final List<Integer> A = new ArrayList<>();
        printIn(n, A);
        System.out.println(A.toString());
    }

    static void printArray(List<Integer> v, int i) {
        for (int j = i; j < v.size(); j++)
            System.out.println(v.get(i));
    }

    private static void printIn(Node n, List<Integer> A) {
        if (n == null) {
            return;
        }
        A.add(n.data);
        //        System.out.println(A.toString());
        printIn(n.left, A);
        //        System.out.println("........");
        printIn(n.right, A);
        int sum = 0;
        for (int i = A.size() - 1; i >= 0; i--) {
            //            System.out.println("here");
            sum = sum + A.get(i);
            //            System.out.println(sum);
            //            System.out.println("-----");
            if (sum == 8) {
                //                System.out.println("-------");
                printArray(A, i);
                //                System.out.println("-------");
            }
        }
        A.remove(A.size() - 1);

    }

}
