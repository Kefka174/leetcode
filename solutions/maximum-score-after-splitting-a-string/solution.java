class Solution {
    public int maxScore(String s) {
        int oneCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') oneCount++;
        }
        int maxScore;
        if (s.charAt(0) == '1') maxScore = oneCount - 1;
        else maxScore = 1 + oneCount;

        int currentScore = maxScore;
        for (int i = 1; i < s.length() - 1; i++) {
            if (s.charAt(i) == '1') currentScore -= 1;
            else currentScore += 1;
            maxScore = Math.max(maxScore, currentScore);
        }
        return maxScore;
    }
}