class Solution {
    public int percentageLetter(String s, char letter) {
        int letterFrequency = 0;
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) == letter) letterFrequency++;
        
        int letterPercentage = letterFrequency * 100 / s.length();
        return letterPercentage;
    }
}