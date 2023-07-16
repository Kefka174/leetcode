import java.util.Deque;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javafx.util.Pair;

class Solution {
    public List<String> findWordsIterative(char[][] board, String[] words) {
        TrieNode root = new TrieNode();
        for (String word : words) root.insert(word, 0);        

        List<String> returnList = new ArrayList<>();
        for (int rowNum = 0; rowNum < board.length; rowNum++) {
            for (int colNum = 0; colNum < board[0].length; colNum++) {
                if (root.contains(board[rowNum][colNum])) {
                    Set<Point> parentSet = new HashSet<>();
                    Deque<Pair<Point, TrieNode>> processStack = new ArrayDeque<>();
                    Deque<Character> charStack = new ArrayDeque<>();

                    Point currentPoint = new Point(rowNum, colNum);
                    TrieNode currentNode = root.getChild(board[rowNum][colNum]);
                    processStack.push(new Pair(currentPoint, currentNode));
                    parentSet.add(currentPoint);

                    while (!processStack.isEmpty()) {
                        currentPoint = processStack.peek().getKey();
                        currentNode = processStack.peek().getValue();
                        parentSet.add(currentPoint);
                        charStack.push(board[currentPoint.row][currentPoint.col]);

                        if (currentNode.isEndOfWord()) {
                            returnList.add(charStackToString(charStack));
                            currentNode.setEndOfWord(false);
                        }
                        if (!checkNeighbors(currentPoint, currentNode, board, processStack, parentSet)) {
                            while (!processStack.isEmpty() && parentSet.contains(processStack.peek().getKey())) {
                                parentSet.remove(processStack.pop().getKey());
                                charStack.pop();
                            }
                        }
                    }
                }
            }
        }
        return returnList;
    }

    private boolean checkNeighbors(Point currentPoint, TrieNode currentNode, char[][] board, 
                                   Deque<Pair<Point, TrieNode>> processStack, Set<Point> parentSet) {
        Point neighborDirection = new Point(0, 1);
        boolean foundValidNeighbor = false;
        for (int i = 0; i < 4; i++) {
            Point neighbor = currentPoint.add(neighborDirection);
            boolean neighborOutOfBounds = neighbor.row < 0 || neighbor.row == board.length ||
                                          neighbor.col < 0 || neighbor.col == board[0].length;
            if (!neighborOutOfBounds) {
                TrieNode nextNode = currentNode.getChild(board[neighbor.row][neighbor.col]);
                if (!parentSet.contains(neighbor) && nextNode != null) {
                    processStack.push(new Pair(neighbor, nextNode));
                    foundValidNeighbor = true;
                }
            }

            int tmp = neighborDirection.row;
            neighborDirection.row = neighborDirection.col;
            neighborDirection.col = -tmp;
        }

        return foundValidNeighbor;
    }

    private String charStackToString(Deque<Character> stack) {
        StringBuilder builder = new StringBuilder();
        for (char c : stack) builder.append(c);
        return builder.reverse().toString();
    }

    class Point {
        int row;
        int col;
    
        Point(int row, int col) {
            this.row = row;
            this.col = col;
        }

        @Override
        public boolean equals(Object other) {
            if (this == other) return true;
            if (!(other instanceof Point)) return false;
            Point otherPoint = (Point) other;
            return row == otherPoint.row && col == otherPoint.col;
        }

        @Override
        public int hashCode() {
            return 31 * row + col;
        }

        Point add(Point other) {
            return new Point(row + other.row, col + other.col);
        }
    }
}


// modified trieNode from 208. Implement Trie (Prefix Tree)
class TrieNode {
    private Map<Character, TrieNode> children;
    private boolean isEndOfWord;

    TrieNode() {
        children = new HashMap<>();
        isEndOfWord = false;
    }

    void insert(String word, int index) {
        char c = word.charAt(index);
        if (!children.containsKey(c)) children.put(c, new TrieNode());

        if (index == word.length() - 1) children.get(c).isEndOfWord = true;
        else children.get(c).insert(word, index + 1);
    }

    boolean startsWith(String prefix, int index) {
        char c = prefix.charAt(index);
        if (!children.containsKey(c)) return false;
        if (index == prefix.length() - 1) return true;
        return children.get(c).startsWith(prefix, index + 1);
    }

    boolean contains(char c) {
        return children.containsKey(c);
    }

    TrieNode getChild(char c) {
        if (children.containsKey(c)) return children.get(c);
        return null;
    }

    boolean isEndOfWord() {
        return isEndOfWord;
    }

    void setEndOfWord(boolean isEndOfWord) {
        this.isEndOfWord = isEndOfWord;
    }
}