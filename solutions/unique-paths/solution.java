class Solution {
    // Based on equation (m+n)! / (m! * n!).
    // Not using factorials directly because they're massive.
    public int uniquePaths(int m, int n) { // O(min(m, n))
        long pathCount = 1;
        int largerSide = Math.max(m, n) - 1;
        int smallerSide = Math.min(m, n);

        for (int i = 1; i < smallerSide; i++) {
            pathCount *= i + largerSide;
            pathCount /= i;
        }

        return (int)pathCount;
    }
}