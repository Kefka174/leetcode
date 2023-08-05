import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int mostCandies = Integer.MIN_VALUE;
        for (int candy : candies)
            if (candy > mostCandies) mostCandies = candy;

        List<Boolean> ret = new ArrayList<>(candies.length);
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= mostCandies) ret.add(true);
            else ret.add(false);
        }
        return ret;
    }
}