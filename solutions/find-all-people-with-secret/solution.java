import java.util.List;
import java.util.Map;

class Solution { // O(mlogm + n)
    public List<Integer> findAllPeople(int n, int[][] meetings, int firstPerson) {
        Map<Integer, List<int[]>> meetingMap = new TreeMap<>();
        for (int[] meeting : meetings) {
            if (!meetingMap.containsKey(meeting[2])) {
                meetingMap.put(meeting[2], new ArrayList<>());
            }
            meetingMap.get(meeting[2]).add(new int[]{meeting[0], meeting[1]});
        }

        UnionFind unionFind = new UnionFind(n);
        unionFind.union(0, firstPerson);
        for (int meetingTime : meetingMap.keySet()) {
            for (int[] meeting : meetingMap.get(meetingTime)) {
                unionFind.union(meeting[0], meeting[1]);
            }
            for (int[] meeting : meetingMap.get(meetingTime)) {
                if (!unionFind.connected(meeting[0], 0)) {
                    unionFind.resetNum(meeting[0]);
                    unionFind.resetNum(meeting[1]);
                }
            }
        }
        
        List<Integer> secretHolders = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (unionFind.connected(i, 0)) secretHolders.add(i);
        }
        return secretHolders;
    }
}

class UnionFind {
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

    public void resetNum(int num) {
        roots[num] = num;
        heights[num] = 0;
    }
}