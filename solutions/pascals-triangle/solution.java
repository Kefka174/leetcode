import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> rows = new ArrayList<>(numRows);
        for (int rowLength = 0; rowLength < numRows; rowLength++) {
            List<Integer> currentRow = new ArrayList<>(rowLength + 1);
            currentRow.add(1);

            for (int i = 1; i < rowLength; i++) {
                int aboveLeft = rows.get(rowLength - 1).get(i - 1);
                int aboveRight = rows.get(rowLength - 1).get(i);
                currentRow.add(aboveLeft + aboveRight);
            }

            if (rowLength >= 1) currentRow.add(1);
            rows.add(currentRow);
        }
        return rows;
    }
}