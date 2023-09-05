/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int bottomIndex = 1, topIndex = n;
        while (bottomIndex <= topIndex) {
            int middleIndex = (int)(((long)topIndex + bottomIndex) / 2);
            int middleGuess = guess(middleIndex);

            if (middleGuess == 0) return middleIndex;
            else if (middleGuess == -1) topIndex = middleIndex - 1;
            else bottomIndex = middleIndex + 1;
        }
        return -1; // unreachable
    }
}