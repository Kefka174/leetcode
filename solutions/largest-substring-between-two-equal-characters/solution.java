import java.util.Map;

class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        Map<Character, Integer> charPositions = new HashMap<>();
        int maxLength = -1;
        for (int i = 0; i < s.length(); i++) {
            if (charPositions.containsKey(s.charAt(i))) {
                maxLength = Math.max(maxLength, i - charPositions.get(s.charAt(i)) - 1);
            }
            else charPositions.put(s.charAt(i), i);
        }
        return maxLength;
    }
}