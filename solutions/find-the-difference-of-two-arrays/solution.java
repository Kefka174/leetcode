import java.util.List;
import java.util.Set;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int num : nums1) set1.add(num);
        for (int num : nums2) set2.add(num);

        List<List<Integer>> differences = new ArrayList<>(2);
        List<Integer> notIn2 = new ArrayList<>();
        for (int num : set1)
            if (!set2.contains(num)) notIn2.add(num);
        List<Integer> notIn1 = new ArrayList<>();
            for (int num : set2)
                if (!set1.contains(num)) notIn1.add(num);

        differences.add(notIn2);
        differences.add(notIn1);

        return differences;
    }
}