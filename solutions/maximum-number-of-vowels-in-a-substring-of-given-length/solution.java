import java.util.Set;

class Solution {
    public int maxVowels(String s, int k) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        int maxVowels = 0, vowelsInWindow = 0;
        int windowStart = 0;
        for (int i = 0; i < s.length(); i++) {
            if (vowels.contains(s.charAt(i))) vowelsInWindow++;
            if (i >= k) {
                if (vowels.contains(s.charAt(windowStart))) vowelsInWindow--;
                windowStart++;
            }

            if (vowelsInWindow > maxVowels) maxVowels = vowelsInWindow;
        }
        return maxVowels;
    }
}