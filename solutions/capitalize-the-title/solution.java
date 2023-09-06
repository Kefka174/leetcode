class Solution {
    public String capitalizeTitle(String title) {
        StringBuilder capitalized = new StringBuilder(title.length() + 1);
        for (String word : title.toLowerCase().split(" ")) {
            if (word.length() > 2)
                capitalized.append(toUpperCase(word.charAt(0)));
            else
                capitalized.append(word.charAt(0));

            for (int i = 1; i < word.length(); i++)
                capitalized.append(word.charAt(i));
            
            capitalized.append(' ');
        }
        capitalized.deleteCharAt(capitalized.length() - 1);
        return capitalized.toString();
    }

    // Alternative to Character.toUpperCase()
    private char toUpperCase(char c) {
        if (c >= 'a' && c <= 'z') return (char)(c - 32);
        else return c;
    }
}