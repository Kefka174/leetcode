class Solution {
    public int candy(int[] ratings) {
        int startIndex = 0, peakIndex = 0, valleyIndex = 0;
        int candyGiven = ratings.length;
        while (valleyIndex < ratings.length - 1) {
            peakIndex = nextIndexWithComparator(ratings, startIndex, -1);
            valleyIndex = nextIndexWithComparator(ratings, peakIndex, 1);
            
            int peakLength = peakIndex - startIndex;
            int valleyLength = valleyIndex - peakIndex;
            if (peakLength < valleyLength) peakLength--;
            else valleyLength--;
            candyGiven += sumOfSequenceLength(peakLength);
            candyGiven += sumOfSequenceLength(valleyLength);

            startIndex = nextIndexWithComparator(ratings, valleyIndex, 0);
        }
        return candyGiven;
    }

    private int sumOfSequenceLength(int length) {
        return length * (length + 1) / 2;
    }

    private int nextIndexWithComparator(int[] arr, int index, int comparatorValue) {
        while (index + 1 < arr.length && Integer.compare(arr[index], arr[index + 1]) == comparatorValue)
            index++;
        return index;
    }
}