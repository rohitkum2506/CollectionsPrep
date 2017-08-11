import java.util.ListIterator;

public class dfs {
    LinkedList ele[];
    int        vertices;

    public dfs(int v) {
        ele = new LinkedList[v];
        this.vertices = v;

        for (int i = 0; i < v; i++) {
            ele[i] = new LinkedList<G>();
        }
    }

    void addEdge(int i, int j) {
        ele[i].add(j);
    }

    public static void main(String args[]) {

        final dfs g = new dfs(5);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Depth First Traversal " + "(starting from vertex 2)");
        g.DFS(2);
    }

    private void DFS(int i) {

        final boolean[] vis = new boolean[this.vertices];

        DFSUtil(i, vis);
    }

    private void DFSUtil(int l, boolean[] vis) {
        vis[l] = true;
        final ListIterator<Integer> itr = ele[l].listIterator();

    }

}
