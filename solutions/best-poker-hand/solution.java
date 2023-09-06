import java.util.Map;

class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        if (isPokerFlush(suits)) return "Flush";
        
        int greatestOfAKind = getMaxFrequency(ranks);
        if (greatestOfAKind >= 3)
            return "Three of a Kind";
        else if (greatestOfAKind == 2)
            return "Pair";
        
        return "High Card";
    }

    private boolean isPokerFlush(char[] suits) {
        for (int i = 1; i < suits.length; i++)
            if (suits[i] != suits[i - 1]) return false;
        return true;
    }

    private int getMaxFrequency(int[] arr) {
        Map<Integer, Integer> frequencies = new HashMap<>();
        int maxFrequency = 1;
        for (int rank : arr) {
            frequencies.merge(rank, 1, Integer::sum);
            if (frequencies.get(rank) > maxFrequency)
                maxFrequency = frequencies.get(rank);
        }
        return maxFrequency;
    }
}