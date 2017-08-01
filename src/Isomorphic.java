/**
 * Two trees are isomorphic if one can be obtained from the other by a series of flips on node, i.e by changing the right and the left nodes.
 * 
 * @author rohitkumar
 *
 */
public class Isomorphic {

    public static void main(String args[]) {
        final Node tree1 = new Node(4);
        final Node tree2 = new Node(5);
        final Node tree3 = new Node(6);
        final Node tree4 = new Node(7);
        final Node tree5 = new Node(8);

        final Node tree11 = new Node(4);
        final Node tree21 = new Node(5);
        final Node tree31 = new Node(6);
        final Node tree41 = new Node(8);
        final Node tree51 = new Node(7);

        tree1.setLeft(tree2);
        tree1.setRight(tree3);

        tree2.setLeft(tree4);
        tree2.setRight(tree5);

        tree11.setLeft(tree21);
        tree11.setRight(tree31);

        tree21.setLeft(tree41);
        tree21.setRight(tree51);

        final boolean r = CheckIsomorphic(tree1, tree11);
        System.out.println(findHeight(tree1));
        //        System.out.println(r);
    }

    public static int findHeight(Node n) {
        if (n == null) {
            return 0;
        } else {
            final int x = findHeight(n.left);
            final int y = findHeight(n.right);
            int max = 0;
            max = x > y ? x : y;
            return max + 1;
        }
    }

    private static boolean CheckIsomorphic(Node tree1, Node tree2) {
        if ((tree1 == null && tree2 != null) || (tree2 == null && tree1 != null)) {
            return false;
        }
        if (tree1 == null && tree2 == null) {
            return true;
        }

        if (tree1.data == tree2.data) {
            return (CheckIsomorphic(tree1.left, tree2.left) && CheckIsomorphic(tree1.right, tree2.right)) || (CheckIsomorphic(tree1.right, tree2.left) && CheckIsomorphic(tree1.left, tree2.right));
        } else
            return false;
    }
}
