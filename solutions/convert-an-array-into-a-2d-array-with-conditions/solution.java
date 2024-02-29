import java.util.List;
import java.util.Set;

class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<Set<Integer>> setsList = new ArrayList<>();
        setsList.add(new HashSet<>());
        for (int num : nums) 
            addToSetsList(num, setsList);
        
        List<List<Integer>> outList = new ArrayList<>(setsList.size());
        for (Set<Integer> set : setsList) 
            outList.add(new ArrayList<>(set));
        return outList;
    }

    private void addToSetsList(int num, List<Set<Integer>> setsList) {
        int index = 0;
        while (setsList.get(index).contains(num)) {
            index++;
            if (index == setsList.size()) 
                setsList.add(new HashSet<>());
        }
        setsList.get(index).add(num);
    }
}