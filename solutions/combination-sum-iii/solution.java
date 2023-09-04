import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        return recursiveHelper(k, n, 1);
    }

    private List<List<Integer>> recursiveHelper(int k, int n, int minValue) {
        List<List<Integer>> combinations = new ArrayList<>();
        if (k == 1 && n >= minValue && n <= 9)
            combinations.add(new ArrayList<>(Arrays.asList(n)));
        else if (k > 1) {
            for (int i = minValue; i < Math.min(9, n); i++) {
                List<List<Integer>> combsWithoutI = recursiveHelper(k - 1,  n - i, i + 1);
                if (combsWithoutI.size() != 0) {
                    for (List<Integer> comb : combsWithoutI) {
                        comb.add(i);
                        combinations.add(comb);
                    }
                }
            }
        }
        return combinations;
    }
}