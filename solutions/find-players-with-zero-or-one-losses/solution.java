import java.util.List;
import java.util.Set;

class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Set<Integer> multLosers = new HashSet<>(),
                     singleLosers = new HashSet<>(),
                     undefeated = new HashSet<>();
        for (int[] match : matches) {
            if (!undefeated.contains(match[0]) && !singleLosers.contains(match[0])
                && !multLosers.contains(match[0])) {
                undefeated.add(match[0]);
            }

            if (!singleLosers.contains(match[1]) && !multLosers.contains(match[1])) {
                undefeated.remove(match[1]);
                singleLosers.add(match[1]);
            }
            else if (singleLosers.contains(match[1])) {
                singleLosers.remove(match[1]);
                multLosers.add(match[1]);
            }
        }
        List<List<Integer>> ret = new ArrayList<>(2);
        ret.add(new ArrayList(undefeated));
        ret.add(new ArrayList(singleLosers));
        ret.get(0).sort(null);
        ret.get(1).sort(null);
        return ret;
    }
}