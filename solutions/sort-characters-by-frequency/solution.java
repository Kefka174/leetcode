import java.util.List;
import java.util.Map;

class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> charFrequencies = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            charFrequencies.merge(s.charAt(i), 1, Integer::sum);
        }

        List<Character>[] buckets = new List[s.length()];
        for (char c : charFrequencies.keySet()) {
            int frequency = charFrequencies.get(c) - 1;
            if (buckets[frequency] == null) buckets[frequency] = new ArrayList<>();
            buckets[frequency].add(c);
        }

        StringBuilder ret = new StringBuilder(s.length());
        for (int i = buckets.length - 1; i >= 0; i--) {
            if (buckets[i] != null) {
                for (char c : buckets[i]) {
                    for (int j = 0; j < i + 1; j++) {
                        ret.append(c);
                    }
                }
            }
        }
        return ret.toString();
    }
}