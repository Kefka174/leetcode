import java.util.Map;

class Solution {
    public boolean makeEqual(String[] words) {
        Map<Character, Integer> charFrequencies = new HashMap<>();
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                charFrequencies.merge(word.charAt(i), 1, Integer::sum);
            }
        }
        
        for (int frequency : charFrequencies.values()) {
            if (frequency % words.length != 0) return false;
        }
        return true;
    }
}