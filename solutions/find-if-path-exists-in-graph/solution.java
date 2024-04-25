class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        UnionFind connectedNodes = new UnionFind(n);
        for (int[] edge : edges) connectedNodes.union(edge[0], edge[1]);
        return connectedNodes.connected(source, destination);
    }
}


class UnionFind { // UnionFind from "2092. Find all people with secret"
    private int[] roots;
    private int[] heights;

    public UnionFind(int capacity) {
        roots = new int[capacity];
        for (int i = 0; i < capacity; i++) roots[i] = i;
        heights = new int[capacity];
    }

    public int find(int num) {
        if (roots[num] != num) roots[num] = find(roots[num]);
        return roots[num];
    }

    public void union(int num1, int num2) {
        int root1 = find(num1), root2 = find(num2);
        if (root1 != root2) {
            if (heights[root2] > heights[root1]) {
                int temp = root1;
                root1 = root2;
                root2 = temp;
            }
            roots[root2] = root1;
            heights[root1]++;
        }
    }

    public boolean connected(int num1, int num2) {
        return find(num1) == find(num2);
    }
}