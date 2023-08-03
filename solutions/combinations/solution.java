import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> combs = new ArrayList<>();
        if (k == 1) {
            for (int i = n; i > 0; i--) 
                combs.add(new ArrayList<>(Arrays.asList(i)));
        }
        else {
            for (int i = n; i >= 1; i--) {
                List<List<Integer>> combsWithoutI = combine(i - 1, k - 1);
                int appendingElement = i;
                combsWithoutI.forEach(list -> list.add(appendingElement));
                combs.addAll(combsWithoutI);
            }
        }
        return combs;
    }
}