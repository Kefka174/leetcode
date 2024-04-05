import java.util.Arrays;

class Solution {
    public String customSortString(String order, String s) {
        Character[] chars = new Character[s.length()];
        for (int i = 0; i < s.length(); i++) chars[i] = s.charAt(i);

        Arrays.sort(chars, (a, b) -> order.indexOf(a) - order.indexOf(b));
        StringBuilder ret = new StringBuilder(s.length());
        for (char c : chars) ret.append(c);
        return ret.toString();
    }
}