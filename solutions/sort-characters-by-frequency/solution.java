import java.util.List;
import java.util.Map;

class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> charFrequencies = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            charFrequencies.merge(s.charAt(i), 1, Integer::sum);
        }

        List<Character> sortedChars = new ArrayList<>(charFrequencies.keySet());
        sortedChars.sort((a, b) -> charFrequencies.get(b) - charFrequencies.get(a));
        StringBuilder ret = new StringBuilder(s.length());
        for (char c : sortedChars) {
            for (int i = 0; i < charFrequencies.get(c); i++) {
                ret.append(c);
            }
        }
        return ret.toString();
    }
}