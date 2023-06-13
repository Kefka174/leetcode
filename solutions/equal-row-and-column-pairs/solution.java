import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public int equalPairs(int[][] grid) {
        int pairCount = 0;
        HashMap<List<Integer>, Integer> rowListCounts = new HashMap<>();
        for (int[] row : grid) {
            Integer[] rowInteger = Arrays.stream(row).boxed().toArray(Integer[]::new);
            List<Integer> rowList = Arrays.asList(rowInteger);
            if (rowListCounts.containsKey(rowList)) rowListCounts.put(rowList, rowListCounts.get(rowList) + 1);
            else rowListCounts.put(rowList, 1);
        }
        
        for (int colNum = 0; colNum < grid.length; colNum++) {
            Integer[] col = new Integer[grid.length];
            for (int rowNum = 0; rowNum < grid.length; rowNum++) col[rowNum] = grid[rowNum][colNum];
            List<Integer> colList = Arrays.asList(col);
            if (rowListCounts.containsKey(colList)) pairCount += rowListCounts.get(colList);
        }
        return pairCount;
    }
}