import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Solution { // O(m * nlogn) which is too slow
    public List<Integer> findAllPeople(int n, int[][] meetings, int firstPerson) {
        Arrays.sort(meetings, (a, b) -> a[2] - b[2]);

        Set<Integer> secretHolders = new HashSet<Integer>();
        secretHolders.add(0);
        secretHolders.add(firstPerson);
        UnionFind unionFind = new UnionFind();
        for (int i = 0; i < meetings.length; i++) {
            unionFind.union(meetings[i][0], meetings[i][1]);
            if (i + 1 == meetings.length || meetings[i][2] != meetings[i + 1][2]) {
                for (int person : Set.copyOf(secretHolders)) {
                    secretHolders.add(unionFind.find(person));
                }
                for (int person : unionFind) {
                    if (!secretHolders.contains(person) 
                        && secretHolders.contains(unionFind.find(person))) {
                        secretHolders.add(person);
                    }
                }
                unionFind = new UnionFind();
            }
        }
        return new ArrayList<>(secretHolders);
    }
}

class UnionFind implements Iterable<Integer> { // Todo: abstract type
    private Map<Integer, Integer> rootMap;
    private Map<Integer, Integer> treeHeights;

    public UnionFind() {
        rootMap = new HashMap<>();
        treeHeights = new HashMap<>();
    }

    public boolean addAsRoot(int num) {
        boolean alreadyContained = rootMap.containsKey(num);
        rootMap.put(num, num);
        treeHeights.put(num, 1);
        return !alreadyContained;
    }

    public int find(int num) { // log(n)
        if (!rootMap.containsKey(num)) addAsRoot(num);

        int root = rootMap.get(num);
        while (rootMap.get(root) != root) root = rootMap.get(root);
        return root;
    }

    public void union(int num1, int num2) { // log(n)
        int root1 = find(num1), root2 = find(num2);
        if (root1 != root2) {
            if (treeHeights.get(root2) > treeHeights.get(root1)) {
                int temp = root1;
                root1 = root2;
                root2 = temp;
            }

            rootMap.put(root2, root1);
            treeHeights.remove(root2);
            treeHeights.merge(root1, 1, Integer::sum);
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return rootMap.keySet().iterator();
    }
}