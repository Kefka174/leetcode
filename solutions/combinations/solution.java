import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> combine(int n, int k) {
        return recursiveCombine(1, n, k);
    }

    private List<List<Integer>> recursiveCombine(int start, int end, int r) {
        List<List<Integer>> combs = new ArrayList<>();
        if (r == 1) {
            List<Integer> singleDigits = new ArrayList<>();
            for (int i = start; i < end + 1; i++) combs.add(Arrays.asList(i));
        }
        else {
            for (int i = start; i <= end + 1 - r; i++) {
                List<List<Integer>> combsWithoutI = recursiveCombine(i + 1, end, r - 1);
                for (List<Integer> list : combsWithoutI) {
                    List<Integer> l = new ArrayList<>(list);
                    l.add(0, i);
                    combs.add(l);
                }
            }
        }
        return combs;
    }
}