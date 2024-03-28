class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] givenAndRecievedTrust = new int[n + 1];
        for (int [] t : trust) {
            givenAndRecievedTrust[t[0]]--;
            givenAndRecievedTrust[t[1]]++;
        }

        for (int i = 1; i < n + 1; i++) {
            if (givenAndRecievedTrust[i] == n - 1) return i;
        }
        return -1;
    }
}