import java.util.List;

class Solution {
    public boolean find132pattern(int[] nums) { // O(n^2)
        List<int[]> minMaxes = new ArrayList<>();
        int[] currentMinMax = new int[] {Integer.MAX_VALUE, Integer.MAX_VALUE};
        minMaxes.add(currentMinMax);
        for (int num : nums) {
            for (int[] minMax : minMaxes) {
                if (num > minMax[0] && num < minMax[1]) return true;
            }

            if (num < currentMinMax[0]) {
                if (currentMinMax[0] != currentMinMax[1]) {
                    if (minMaxes.size() > 1 && currentMinMax[1] > minMaxes.get(minMaxes.size() - 2)[1]) {
                        minMaxes.remove(minMaxes.size() - 2);
                    }
                    currentMinMax = new int[2];
                    minMaxes.add(currentMinMax);
                } 
                currentMinMax[0] = num;
                currentMinMax[1] = num;
            }
            else if (num > currentMinMax[1]) currentMinMax[1] = num;
        }
        return false;
    }
}