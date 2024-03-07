import java.util.Map;

class Solution {
    public int minSteps(String s, String t) {
        Map<Character, Integer> sFrequencies = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            sFrequencies.merge(s.charAt(i), 1, Integer::sum);
        }

        int outliers = 0;
        for (int i = 0; i < t.length(); i++) {
            if (sFrequencies.containsKey(t.charAt(i))) {
                sFrequencies.merge(t.charAt(i), -1, Integer::sum);
                if (sFrequencies.get(t.charAt(i)) == 0) {
                    sFrequencies.remove(t.charAt(i));
                }
            }
            else outliers++;
        }
        return outliers;
    }
}