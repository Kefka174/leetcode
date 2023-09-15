class Solution {
    public int candy(int[] ratings) {
        int filledIndex = 0, peakIndex = 0, valleyIndex = 0;
        int candyGiven = ratings.length;
        while (valleyIndex < ratings.length - 1) {
            peakIndex = nextPeakIndex(ratings, filledIndex);
            valleyIndex = nextValleyIndex(ratings, peakIndex);
            
            int peakLength = peakIndex - filledIndex;
            int valleyLength = valleyIndex - peakIndex;
            if (peakLength < valleyLength) peakLength--;
            else valleyLength--;
            
            candyGiven += summed(peakLength);
            candyGiven += summed(valleyLength);

            filledIndex = endOfPlateau(ratings, valleyIndex);
        }
        return candyGiven;
    }

    private int summed(int length) {
        return length * (length + 1) / 2;
    }

    private int nextPeakIndex(int[] arr, int index) {
        while (index + 1 < arr.length && arr[index] < arr[index + 1])
            index++;
        return index;
    }

    private int nextValleyIndex(int[] arr, int index) {
        while (index + 1 < arr.length && arr[index] > arr[index + 1])
            index++;
        return index;
    }

    private int endOfPlateau(int[] arr, int index) {
        while (index + 1 < arr.length && arr[index] == arr[index + 1]) 
            index++;
        return index;
    }
}