import java.util.List;

class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ret = new ArrayList<>();
        int currentNum = nextSequentialNum(low);
        while (currentNum != -1 && currentNum <= high) {
            ret.add(currentNum);
            currentNum = nextSequentialNum(currentNum + 1);
        }
        return ret;
    }

    private int nextSequentialNum(int num) {
        if (num > 123456789) return -1;

        int firstDigit = num;
        while (firstDigit > 9) firstDigit /= 10;
        int length = (int)Math.ceil(Math.log10(num));

        int nextNum;
        do {
            nextNum = calcSequentialNum(firstDigit, length);
            if (firstDigit == 9) {
                firstDigit = 1;
                length++;
            }
            else firstDigit++;
        } while (nextNum < num);
        return nextNum;
    }

    private int calcSequentialNum(int firstDigit, int length) {
        if (firstDigit + length > 10) return -1;

        int num = firstDigit;
        for (int i = 0; i < length - 1; i++) {
            int nextDigit = (num % 10) + 1;
            num *= 10;
            num += nextDigit;
        }
        return num;
    }
}