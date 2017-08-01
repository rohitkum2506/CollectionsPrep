
public class LinkedList<E> {
    private static class Node<E> {
        E       val;
        Node<E> next;

        public Node(E val, Node n) {
            this.val = val;
            next = n;
        }
    }

    private Node<E>       head = null;
    private final Node<E> tail = null;

    public LinkedList() {
        head = null;
    }

    public void add(E o) {
        if (o != null) {
            final Node<E> n = new Node<E>(o, null);
            Node<E> previous = null;
            if (head == null) {
                head = n;
            } else if (head != null) {
                Node<E> temp = head;
                while (temp.next != null) {
                    previous = temp;
                    temp = temp.next;
                }
                temp.next = n;

            }

        }
    }
}
