import java.util.Collections;
import java.util.Map;
import java.util.Set;

class Solution {
    public int minDeletions(String s) {
        Map<Character, Integer> charFrequencies = countFrequencies(s);
        int maxFrequency = Collections.max(charFrequencies.values());

        Map<Integer, Set<Character>> frequencyBuckets = frequencyMapToBuckets(charFrequencies);

        int deletionCount = 0;
        for (int frequency = maxFrequency; frequency > 0; frequency--) {
            Set<Character> charsWithFrequency = frequencyBuckets.get(frequency);
            if (charsWithFrequency != null && charsWithFrequency.size() > 1) {
                deletionCount += charsWithFrequency.size() - 1;
                makeFrequencyUnique(frequency, frequencyBuckets);
            }
        }
        return deletionCount;
    }

    private Map<Character, Integer> countFrequencies(String s) {
        Map<Character, Integer> charFrequencies = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            charFrequencies.merge(s.charAt(i), 1, Integer::sum);
        }
        return charFrequencies;
    }

    private Map<Integer, Set<Character>> frequencyMapToBuckets(Map<Character, Integer> charFrequencies) {
        Map<Integer, Set<Character>> frequencyBuckets = new HashMap<>();
        for (char c : charFrequencies.keySet()) {
            int frequency = charFrequencies.get(c);
            if (!frequencyBuckets.containsKey(frequency)) frequencyBuckets.put(frequency, new HashSet<>());
            frequencyBuckets.get(frequency).add(c);
        }
        return frequencyBuckets;
    }

    private void makeFrequencyUnique(int frequency, Map<Integer, Set<Character>> frequencyBuckets) {
        Set<Character> charsWithFrequency = frequencyBuckets.get(frequency);
        if (!frequencyBuckets.containsKey(frequency - 1)) frequencyBuckets.put(frequency - 1, new HashSet<>());
        while (charsWithFrequency.size() > 1) {
            char c = charsWithFrequency.iterator().next();
            charsWithFrequency.remove(c);
            frequencyBuckets.get(frequency - 1).add(c);
        }
    }
}