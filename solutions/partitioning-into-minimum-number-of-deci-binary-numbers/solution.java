class Solution {
    public int minPartitionsOneLine(String n) {
        return n.chars().max().getAsInt() - '0';
    }


    ////////////////////////////////////////////////////
    public int minPartitions(String n) {
        int maxDigit = 0;
        for (char c : n.toCharArray()) {
            int digit = c - '0';
            if (digit > maxDigit) maxDigit = digit;
        }
        return maxDigit;
    }
}