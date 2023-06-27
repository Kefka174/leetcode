import java.util.Map;
import java.util.Set;

class Trie {
    TrieNode root;
    Set<String> wordSet;

    public Trie() {
        root = new TrieNode();
        wordSet = new HashSet<>();
    }
    
    public void insert(String word) {
        wordSet.add(word);
        root.insert(word, 0);
    }
    
    public boolean search(String word) {
        return wordSet.contains(word);
    }
    
    public boolean startsWith(String prefix) {
        return root.startsWith(prefix, 0);
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

        private boolean startsWith(String prefix, int index) {
            char c = prefix.charAt(index);
            if (!children.containsKey(c)) return false;
            if (index == prefix.length() - 1) return true;
            return children.get(c).startsWith(prefix, index + 1);
        }
    }
}