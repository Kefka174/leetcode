import java.util.Arrays;

class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int lowIndex = 0, highIndex = tokens.length - 1;
        int score = 0, maxScore = 0;
        while (lowIndex <= highIndex && (power >= tokens[lowIndex] || score > 0)) {
            if (power >= tokens[lowIndex]) {
                power -= tokens[lowIndex];
                lowIndex++;
                score++;
            }
            else {
                power += tokens[highIndex];
                highIndex--;
                score--;
            }

            maxScore = Math.max(score, maxScore);
        }
        return maxScore;
    }
}