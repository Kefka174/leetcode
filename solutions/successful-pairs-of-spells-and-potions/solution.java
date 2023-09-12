import java.util.Arrays;
import java.util.TreeMap;

class Solution {
    // O(m*logm + n*logm)
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] sortedPotions = potions.clone();
        Arrays.sort(sortedPotions);
        TreeMap<Integer, Integer> numPotionsGreaterThanKey = new TreeMap<>();
        for (int i = 0; i < sortedPotions.length; i++)
            numPotionsGreaterThanKey.putIfAbsent(sortedPotions[i], sortedPotions.length - i);

        int[] spellPairCounts = new int[spells.length];
        for (int i = 0; i < spells.length; i++) {
            int potionStrengthNeeded = (int)Math.ceil(success / (double)spells[i]);
            Integer position = numPotionsGreaterThanKey.ceilingKey(potionStrengthNeeded);
            if (position == null) spellPairCounts[i] = 0;
            else spellPairCounts[i] = numPotionsGreaterThanKey.get(position);
        }
        return spellPairCounts;
    }
}