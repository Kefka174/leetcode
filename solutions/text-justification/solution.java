import java.util.List;

class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> justifiedLines = new ArrayList<>();
        List<String> currentLine = new ArrayList<>();
        int currentLineLength = 0;
        for (int i = 0; i < words.length; i++) {
            currentLine.add(words[i]);
            currentLineLength += words[i].length() + 1;
            boolean isLastWord = i == words.length - 1;
            if (isLastWord || currentLineLength + words[i + 1].length() > maxWidth) {
                justifiedLines.add(justifyLine(currentLine, maxWidth, !isLastWord));
                currentLine.clear();
                currentLineLength = 0;
            }
        }
        return justifiedLines;
    }

    private String justifyLine(List<String> words, int maxWidth, boolean packEvenly) {
        double spacesNeeded = maxWidth;
        for (String word : words) spacesNeeded -= word.length();

        StringBuilder line = new StringBuilder(maxWidth);
        for (int i = 0; i < words.size(); i++) {
            line.append(words.get(i));
            int spacesAfterWord = 1;
            if (packEvenly || i == words.size() - 1)
                spacesAfterWord = (int)Math.ceil(spacesNeeded / Math.max(1, words.size() - 1 - i));
            for (int j = 0; j < spacesAfterWord; j++) line.append(' ');
            spacesNeeded -= spacesAfterWord;
        }
        return line.toString();
    }
}