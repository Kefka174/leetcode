import java.util.List;
import java.util.Map;

class Solution {
    static final int suggestionSize = 3;

    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        TrieNode trie = new TrieNode();
        for (String product : products) trie.insert(product, 0);

        List<List<String>> productSuggestions = new ArrayList<>(searchWord.length());
        trie.getSuggestions(searchWord, 0, productSuggestions);
        return productSuggestions;
    }

    class TrieNode {
        private Map<Character, TrieNode> children;
        private List<String> suggestions;

        TrieNode() {
            children = new HashMap<>();
            suggestions = new ArrayList<>(suggestionSize + 1);
        }

        public void insert(String word, int index) {
            char c = word.charAt(index);
            if (!children.containsKey(c)) children.put(c, new TrieNode());
            children.get(c).insertSuggestion(word);

            if (index  + 1 < word.length()) children.get(c).insert(word, index + 1);
        }

        public void getSuggestions(String searchString, int index, List<List<String>> returnList) {
            TrieNode child = children.get(searchString.charAt(index));
            if (child != null) {
                returnList.add(child.suggestions);
                if (index + 1 < searchString.length())
                    child.getSuggestions(searchString, index + 1, returnList);
            }
            else 
                for (int i = 0; i < searchString.length() - index; i++)
                    returnList.add(new ArrayList<>());
        }

        private void insertSuggestion(String word) {
            int placement = 0;
            while (suggestions.size() > placement && suggestions.get(placement).compareTo(word) < 0)
                placement++;
            suggestions.add(placement, word);
            
            if (suggestions.size() > suggestionSize) suggestions.remove(suggestionSize);
        }
    }
}