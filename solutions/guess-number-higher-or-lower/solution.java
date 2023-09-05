/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumberTernarySearch(int n) {
        int bottomIndex = 1, topIndex = n;
        while (bottomIndex <= topIndex) {
            int oneThirdIndex = bottomIndex + (topIndex - bottomIndex) / 3;
            int twoThirdsIndex = bottomIndex + 2 * ((topIndex - bottomIndex) / 3);
            int oneThirdGuess = guess(oneThirdIndex);
            int twoThirdsGuess = guess(twoThirdsIndex);

            if (oneThirdGuess == 0) return oneThirdIndex;
            if (twoThirdsGuess == 0) return twoThirdsIndex;

            if (oneThirdGuess == -1) topIndex = oneThirdIndex - 1;
            else if (twoThirdsGuess == 1) bottomIndex = twoThirdsIndex + 1;
            else {
                topIndex = twoThirdsIndex - 1;
                bottomIndex = oneThirdIndex + 1;
            }

        }
        return -1; // unreachable
    }


    //////////////////////////////////////////////////////////////////////
    public int guessNumberBinarySearch(int n) {
        int bottomIndex = 1, topIndex = n;
        while (bottomIndex <= topIndex) {
            int middleIndex = bottomIndex + (topIndex - bottomIndex) / 2;
            int middleGuess = guess(middleIndex);

            if (middleGuess == 0) return middleIndex;
            else if (middleGuess == -1) topIndex = middleIndex - 1;
            else bottomIndex = middleIndex + 1;
        }
        return -1; // unreachable
    }
}