import java.util.List;
import java.util.Map;

class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer, Integer> playerLosses = new TreeMap<>();
        for (int[] match : matches) {
            playerLosses.merge(match[0], 0, Integer::sum);
            playerLosses.merge(match[1], 1, Integer::sum);
        }
        
        List<List<Integer>> ret = new ArrayList<>(2);
        ret.add(new ArrayList<>());
        ret.add(new ArrayList<>());

        for (int player : playerLosses.keySet()) {
            if (playerLosses.get(player) == 0) ret.get(0).add(player);
            if (playerLosses.get(player) == 1) ret.get(1).add(player);
        }
        return ret;
    }
}