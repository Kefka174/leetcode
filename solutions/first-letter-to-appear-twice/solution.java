import java.util.Set;

class Solution {
    public char repeatedCharacterBitManipulation(String s) {
        int stringMask = 0;
        for (int i = 0; i < s.length(); i++) {
            int charMask = 1 << (s.charAt(i) - 'a');
            if ((stringMask & charMask) != 0) return s.charAt(i);

            stringMask |= charMask;
        }
        return s.charAt(0); // unreachable
    }


    ///////////////////////////////////////////////////////
    public char repeatedCharacterSet(String s) {
        Set<Character> charSet = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char charAtI = s.charAt(i);

            if (charSet.contains(charAtI)) return charAtI;
            else charSet.add(charAtI);
        }
        return s.charAt(0); // unreachable
    }
}