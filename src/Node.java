class Node {
    int  data;
    Node left;
    Node right;

    public Node(int d) {
        this.data = d;
        this.left = null;
        this.right = null;
    }

    public void setLeft(Node l) {
        this.left = l;
    }

    public void setRight(Node r) {
        this.right = r;
    }

}
