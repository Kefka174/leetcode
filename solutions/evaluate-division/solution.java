import java.util.Deque;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javafx.util.Pair;

class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String, Map<String, Double>> varRelations = makeRelationMap(equations, values);
        double[] queryResults = new double[queries.size()];
        for (int i = 0; i < queries.size(); i++)
            queryResults[i] = evaluateQuery(queries.get(i), varRelations);
        return queryResults;
    }

    private Map<String, Map<String, Double>> makeRelationMap(List<List<String>> equations, double[] values) {
        Map<String, Map<String, Double>> varRelations = new HashMap<>();
        for (int i = 0; i < equations.size(); i++) {
            String numerator = equations.get(i).get(0);
            String denominator = equations.get(i).get(1);

            varRelations.putIfAbsent(numerator, new HashMap<>());
            varRelations.putIfAbsent(denominator, new HashMap<>());
            varRelations.get(numerator).put(denominator, values[i]);
            varRelations.get(denominator).put(numerator, 1 / values[i]);
        }
        return varRelations;
    }

    private double evaluateQuery(List<String> query, Map<String, Map<String, Double>> varRelations) {
        String numerator = query.get(0);
        String denominator = query.get(1);
        if (!varRelations.containsKey(numerator) || !varRelations.containsKey(denominator))
            return -1;
        
        Deque<Pair<String, Double>> varStack = new ArrayDeque<>();
        varStack.push(new Pair(numerator, 1.0));
        Set<String> visitedVars = new HashSet<>();
        visitedVars.add(numerator);
        while (!varStack.isEmpty()) {
            String currentVar = varStack.peek().getKey();
            double partialResult = varStack.pop().getValue();
            if (varRelations.get(currentVar).containsKey(denominator))
                return partialResult * varRelations.get(currentVar).get(denominator);

            for (Map.Entry<String, Double> neighborVar : varRelations.get(currentVar).entrySet()) {
                if (!visitedVars.contains(neighborVar.getKey())) {
                    visitedVars.add(neighborVar.getKey());
                    varStack.push(new Pair(neighborVar.getKey(), partialResult * neighborVar.getValue()));
                }
            }
        }
        return -1; // unreachable
    }
}