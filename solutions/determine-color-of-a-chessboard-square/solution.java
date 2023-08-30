class Solution {
    public boolean squareIsWhite(String coordinates) {
        int col = coordinates.charAt(0) - 'a' - 1;
        int row = coordinates.charAt(1) - '0' + 1;
        
        int cell = (9 * row) + col;

        return cell % 2 == 0;
    }


    /////////////////////////////////////////////////////////////////
    // Pair programed with Ashley Peterson
    public boolean squareIsWhiteConditional(String coordinates) {
        char col = coordinates.charAt(0);
        int row = coordinates.charAt(1) - '0';

        if (col == 'a' || col == 'c' || col == 'e' || col == 'g') {
            if (row % 2 == 0) return true;
            else return false;
        }
        else {
            if (row % 2 == 0) return false;
            else return true;
        }
    }
}