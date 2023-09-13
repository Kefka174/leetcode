import java.util.Arrays;

class Solution {
    // O(m*logm + n*logm)
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] sortedPotions = potions.clone();
        Arrays.sort(sortedPotions);

        int[] spellPairCounts = new int[spells.length];
        for (int i = 0; i < spells.length; i++) {
            int potionStrengthNeeded = (int)Math.ceil(success / (double)spells[i]);
            int potionIndex = binarySearchIndex(sortedPotions, potionStrengthNeeded);
            spellPairCounts[i] = potions.length - potionIndex;
        }
        return spellPairCounts;
    }

    private int binarySearchIndex(int[] arr, int target) {
        int leftIndex = 0, rightIndex = arr.length - 1;
        while (leftIndex <= rightIndex) {
            int middleIndex = (leftIndex + rightIndex) / 2;
            if (arr[middleIndex] >= target) 
                rightIndex = middleIndex - 1;
            else
                leftIndex = middleIndex + 1;
        }
        return leftIndex;
    }
}