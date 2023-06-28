import java.util.Map;

class WordDictionary {
    TrieNode root;

    public WordDictionary() {
        root = new TrieNode();
    }
    
    public void addWord(String word) {
        root.insert(word, 0);
    }
    
    public boolean search(String word) {
        return root.search(word, 0);
    }

    class TrieNode {
        Map<Character, TrieNode> children;
        boolean isEndOfWord;

        TrieNode() {
            children = new HashMap<>();
            isEndOfWord = false;
        }

        private void insert(String word, int index) {
            char c = word.charAt(index);
            if (!children.containsKey(c)) children.put(c, new TrieNode());

            if (index == word.length() - 1) children.get(c).isEndOfWord = true;
            else children.get(c).insert(word, index + 1);
        }

        private boolean search(String prefix, int index) {
            char c = prefix.charAt(index);
            if (c == '.') {
                for (char child : children.keySet()) {
                    if (index == prefix.length() - 1) {
                        if (children.get(child).isEndOfWord) return true;
                    }
                    else if (children.get(child).search(prefix, index + 1)) return true;
                }
                return false;
            }

            if (!children.containsKey(c)) return false;
            if (index == prefix.length() - 1) return children.get(c).isEndOfWord;
            return children.get(c).search(prefix, index + 1);
        }
    }
}