import java.util.Set;

class Solution {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) return false;

        char charNeeded = '\0', charToReplace = '\0';
        Set<Character> charSet = new HashSet<>();
        boolean couldSwapDuplicate = false;
        for (int i = 0; i < s.length(); i++) {
            if (!charSet.contains(s.charAt(i))) charSet.add(s.charAt(i));
            else couldSwapDuplicate = true;

            if (s.charAt(i) != goal.charAt(i)) {
                if (charNeeded == '\0') {
                    charToReplace = s.charAt(i);
                    charNeeded = goal.charAt(i);
                }
                else if (charNeeded == s.charAt(i) && charToReplace == goal.charAt(i)) 
                    charNeeded = '\n';
                else return false;
            }
        }

        if (charNeeded == '\n' || (charNeeded == '\0' && couldSwapDuplicate)) 
            return true;
        return false;
    }
}