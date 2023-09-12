import java.util.List;
import java.util.Map;

class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> groups = new ArrayList<>();
        Map<Integer, List<Integer>> partialGroups = new HashMap<>();
        for (int i = 0; i < groupSizes.length; i++) {
            int size = groupSizes[i];
            if (!partialGroups.containsKey(size))
                partialGroups.put(size, new ArrayList<>(size));
            
            partialGroups.get(size).add(i);

            if (partialGroups.get(size).size() == size)
                groups.add(partialGroups.remove(size));
        }
        return groups;
    }
}