import java.util.Map;

class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> charFrequencies = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            charFrequencies.merge(s.charAt(i), 1, Integer::sum);
        }
        for (int i = 0; i < s.length(); i++) {
            if (charFrequencies.get(s.charAt(i)) == 1) return i;
        }
        return -1;
    }
}