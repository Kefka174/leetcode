class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fives = 0, tens = 0;
        for (int currentBill : bills) {
            int changeNeeded = currentBill - 5;
            
            if (changeNeeded > 0) {
                if (changeNeeded >= 10 && tens > 0) {
                    tens--;
                    changeNeeded -= 10;
                }
                while (changeNeeded >= 5 && fives > 0) {
                    fives--;
                    changeNeeded -= 5;
                }

                if (changeNeeded != 0) return false;
            }

            if (currentBill == 5) fives++;
            else if (currentBill == 10) tens++;
        }
        return true;
    }
}