class Solution {
    // Could remove the counting of the initial penalty because the initial penalty
    // value doesn't matter, only the change in penalties relative to the initial.
    public int bestClosingTime(String customers) {
        int currentPenalty = 0; // initially penalty for closing at hour 0
        for (int i = 0; i < customers.length(); i++)
            if (customers.charAt(i) == 'Y')
                currentPenalty++;

        int minPenaltyHour = 0;
        int minPenalty = currentPenalty;
        for (int i = 1; i <= customers.length(); i++) {
            if (customers.charAt(i - 1) == 'Y') currentPenalty--;
            else currentPenalty++;

            if (currentPenalty < minPenalty) {
                minPenalty = currentPenalty;
                minPenaltyHour = i;
            }
        }
        return minPenaltyHour;
    }
}