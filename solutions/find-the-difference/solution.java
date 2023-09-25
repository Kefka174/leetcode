import java.util.Map;

class Solution {
    public char findTheDifferenceCharValue(String s, String t) {
        return (char)(charValueTotal(t) - charValueTotal(s));
    }

    private int charValueTotal(String s) {
        int total = 0;
        for (int i = 0; i < s.length(); i++) 
            total += s.charAt(i);
        return total;
    }


    /////////////////////////////////////////////////////////////////////////////////////
    public char findTheDifferenceFrequencies(String s, String t) {
        Map<Character, Integer> sFrequencies = makeFrequencyMap(s);
        Map<Character, Integer> tFrequencies = makeFrequencyMap(t);
        for (char c : tFrequencies.keySet()) {
            if (!sFrequencies.containsKey(c) || sFrequencies.get(c) != tFrequencies.get(c))
                return c;
        }
        return 'X'; // unreachable
    }

    private Map<Character, Integer> makeFrequencyMap(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) 
            map.merge(s.charAt(i), 1, Integer::sum);
        return map;
    }
}