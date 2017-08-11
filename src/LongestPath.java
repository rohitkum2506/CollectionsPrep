import java.util.ArrayList;
import java.util.List;

public class LongestPath {
    public static void main(String args[]) {
        final Node tree1 = new Node(4);
        final Node tree2 = new Node(5);
        final Node tree3 = new Node(6);
        final Node tree4 = new Node(7);
        final Node tree5 = new Node(8);

        tree1.setLeft(tree2);
        tree1.setRight(tree3);

        tree2.setLeft(tree4);
        tree2.setRight(tree5);
        final List<Integer> a = new ArrayList<Integer>();
        findKSum(tree1, a, 5);
        System.out.println(a);
    }

    private static void findKSum(Node tree, List<Integer> a, int sum) {
        if (tree == null) {
            return;
        }
        a.add(tree.data);
        findKSum(tree.left, a, sum);
        findKSum(tree.right, a, sum);

        final int s = a.size();
        int su = 0;
        for (int i = s - 1; i >= 0; i--) {
            if (su == sum) {
                System.out.println(a);
            }
            su += a.get(i);

        }
        a.remove(s - 1);
    }
}
