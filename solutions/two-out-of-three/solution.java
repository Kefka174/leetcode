import java.util.List;
import java.util.Set;

class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> finalSet = new HashSet<>();
        Set<Integer> numsSeen = new HashSet<>(nums1.length);
        for (int num : nums1) numsSeen.add(num);

        for (int num : nums2)
            if (numsSeen.contains(num)) finalSet.add(num);
        for (int num : nums2) numsSeen.add(num);

        for (int num : nums3)
            if (numsSeen.contains(num)) finalSet.add(num);

        return List.copyOf(finalSet);
    }
}