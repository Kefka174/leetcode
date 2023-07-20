import java.util.Arrays;

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) { // O(nlogn) due to sorting
        int[][] sortedIntervals = intervals.clone();
        Arrays.sort(sortedIntervals, (a, b) -> Integer.compare(a[0], b[0]));

        int intervalsErased = 0;
        int previousEnd = sortedIntervals[0][1];
        for (int i = 1; i < sortedIntervals.length; i++) {
            if (sortedIntervals[i][0] < previousEnd) {
                intervalsErased++;
                previousEnd = Math.min(previousEnd, sortedIntervals[i][1]);
            }
            else previousEnd = sortedIntervals[i][1];
        }

        return intervalsErased;
    }
}