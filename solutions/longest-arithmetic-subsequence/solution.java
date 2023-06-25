import java.util.Map;

class Solution {
    public int longestArithSeqLength(int[] nums) { // O(n^2)
        int maxLength = 1;
        Map<Integer, Integer>[] seqEndingAtI = new HashMap[nums.length];
        for (int i = 0; i < nums.length; i++) {
            seqEndingAtI[i] = new HashMap<>();
            for (int j = 0; j < i; j++) {
                int difference = nums[i] - nums[j];
                int seqLength = seqEndingAtI[j].getOrDefault(difference, 1) + 1;
                seqEndingAtI[i].put(difference, seqLength);

                if (seqLength > maxLength) maxLength = seqLength;
            }
        }
        return maxLength;
    }
}