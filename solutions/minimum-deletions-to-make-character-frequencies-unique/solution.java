import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.List;

class Solution {
    public int minDeletions(String s) {
        List<Character> charList = s.chars().mapToObj(e->(char)e).collect(Collectors.toList());
        Map<Character, Integer> charFrequencies = makeFrequencyMap(charList);
        
        Map<Integer, Integer> frequencyCounts = makeFrequencyMap(charFrequencies.values());
        
        int deletionCount = 0;
        int maxFrequency = Collections.max(frequencyCounts.keySet());
        for (int frequency = maxFrequency; frequency > 0; frequency--) {
            Integer charsWithFrequency = frequencyCounts.get(frequency);
            if (charsWithFrequency != null && charsWithFrequency > 1) {
                deletionCount += charsWithFrequency - 1;
                frequencyCounts.merge(frequency - 1, charsWithFrequency - 1, Integer::sum);
            }
        }
        return deletionCount;
    }

    private <T> Map<T, Integer> makeFrequencyMap(Collection<T> items) {
        Map<T, Integer> frequencies = new HashMap<>();
        for (T item : items) {
            frequencies.merge(item, 1, Integer::sum);
        }
        return frequencies;
    }
}