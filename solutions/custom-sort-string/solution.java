import java.util.Arrays;

class Solution {
    public String customSortString(String order, String s) { // O(nlogn)
        Character[] chars = new Character[s.length()];
        for (int i = 0; i < s.length(); i++) chars[i] = s.charAt(i);

        Arrays.sort(chars, (a, b) -> order.indexOf(a) - order.indexOf(b));
        StringBuilder ret = new StringBuilder(s.length());
        for (char c : chars) ret.append(c);
        return ret.toString();
    }

    public String customSortlessSortString(String order, String s) { // O(n)
        char[] frequencies = new char[order.length()];
        StringBuilder ret = new StringBuilder(s.length());
        for (int i = 0; i < s.length(); i++) {
            int orderIndex = order.indexOf(s.charAt(i));
            if (orderIndex == -1) ret.append(s.charAt(i));
            else frequencies[orderIndex]++;
        }
        for (int i = 0; i < frequencies.length; i++) {
            while (frequencies[i] > 0) {
                ret.append(order.charAt(i));
                frequencies[i]--;
            }
        }
        return ret.toString();
    }
}