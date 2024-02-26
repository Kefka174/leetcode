import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int contentCount = 0, cookieIndex = 0;
        for (int greed : g) {
            while (cookieIndex < s.length && s[cookieIndex] < greed) cookieIndex++;
            if (cookieIndex == s.length) return contentCount;
            cookieIndex++;
            contentCount++;
        }
        return contentCount;
    }
}