class Solution {
    public String removeStars(String s) {
        StringBuilder endString = new StringBuilder();
        int starStreak = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '*') starStreak++;
            else {
                if (starStreak > 0) starStreak--;
                else endString.append(s.charAt(i));
            }
        }
        endString.reverse();
        return endString.toString();
    }
}