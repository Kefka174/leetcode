import java.util.Collection;
import java.util.Map;

class Solution {
    // Compares unique characters and unassociated character frequencies
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) return false;

        Map<Character, Integer> word1CharMap = makeCharFrequencyMap(word1);
        Map<Character, Integer> word2CharMap = makeCharFrequencyMap(word2);

        Map<Integer, Integer> word1ValueMap = makeIntFrequencyMap(word1CharMap.values());
        Map<Integer, Integer> word2ValueMap = makeIntFrequencyMap(word2CharMap.values());

        return word1CharMap.keySet().equals(word2CharMap.keySet()) && 
               word1ValueMap.equals(word2ValueMap);
    }

    private Map<Character, Integer> makeCharFrequencyMap(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++)
            map.merge(s.charAt(i), 1, Integer::sum);
        return map;
    }

    private Map<Integer, Integer> makeIntFrequencyMap(Collection<Integer> ints) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer value : ints)
            map.merge(value, 1, Integer::sum);
        return map;
    }
}