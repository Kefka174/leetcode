class Solution {
    // Binary searches for the maxValue that will maintain a valid array.
    public int maxValue(int n, int index, int maxSum) { // O(log2(maxSum))
        int topVal = maxSum;
        int bottomVal = 1;
        int maxValidVal = 0;

        while (bottomVal <= topVal) {
            int middleVal = ((topVal - bottomVal) / 2) + bottomVal;
            long leftSum = minSumCountingDownFromVal(middleVal, index);
            long rightSum = minSumCountingDownFromVal(middleVal, n - (index + 1));
            
            if (leftSum + middleVal + rightSum == maxSum) return middleVal;
            else if (leftSum + middleVal + rightSum < maxSum) {
                maxValidVal = middleVal;
                bottomVal = middleVal + 1;
            }
            else topVal = middleVal - 1;
        }
        return maxValidVal;
    }

    // Calculates the sum of the bounded array decreasing from val-1.
    // Ex. val=7, length=4 calculates the sum of [6, 5, 4, 3]
    private long minSumCountingDownFromVal(int val, int length) {
        int firstNum = val - 1;
        int n = Math.min(val, length);
        int lastNum = val - n;
        
        long sum = (long) ((firstNum + lastNum) * (double) n / 2);
        if (val <= length) sum += length - (val - 1);
        return sum;
    }
}


// Testing
class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.maxValue(4, 2, 6)); // 2
        System.out.println(sol.maxValue(6, 1, 10)); // 3
        System.out.println(sol.maxValue(3, 0, 815094800)); // 271698267
        System.out.println(sol.maxValue(7, 0, 930041194)); // 132863030
        System.out.println(sol.maxValue(2332617, 1674899, 775481595)); // 27806
        System.out.println(sol.maxValue(4, 0, 4)); // 1
        System.out.println(sol.maxValue(9, 5, 24)); // 4
    }
}