import java.util.Arrays;
import java.util.Set;

class Solution {
    public String reverseVowels(String s) {
        char[] sArray = s.toCharArray();
        int frontIndex = 0, backIndex = s.length() - 1;
        while (frontIndex < backIndex) {
            while (frontIndex < sArray.length && !isVowel(sArray[frontIndex]))
                frontIndex++;
            while (backIndex >= 0 && !isVowel(sArray[backIndex]))
                backIndex--;
            
            if (frontIndex < backIndex) {
                char temp = sArray[frontIndex];
                sArray[frontIndex] = sArray[backIndex];
                sArray[backIndex] = temp;

                frontIndex++;
                backIndex--;
            }
        }
        return new String(sArray);
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
               c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}