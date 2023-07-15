# Design Add and Search Words Data Structure

Design a data structure that supports adding new words and finding if a string matches any previously added string.

Implement the <code>WordDictionary</code> class:

- <code>WordDictionary()</code>&nbsp;Initializes the object.

- <code>void addWord(word)</code> Adds <code>word</code> to the data structure, it can be matched later.

- <code>bool search(word)</code>&nbsp;Returns <code>true</code> if there is any string in the data structure that matches <code>word</code>&nbsp;or <code>false</code> otherwise. <code>word</code> may contain dots <code>'.'</code> where dots can be matched with any letter.


**Example:**
>
> **Input**
>
> ["WordDictionary","addWord","addWord","addWord","search","search","search","search"]
>
> [[],["bad"],["dad"],["mad"],["pad"],["bad"],[".ad"],["b.."]]
>
> **Output**
>
> [null,null,null,null,false,true,true,true]
>
> **Explanation**
>
> WordDictionary wordDictionary = new WordDictionary();
>
> wordDictionary.addWord("bad");
>
> wordDictionary.addWord("dad");
>
> wordDictionary.addWord("mad");
>
> wordDictionary.search("pad"); // return False
>
> wordDictionary.search("bad"); // return True
>
> wordDictionary.search(".ad"); // return True
>
> wordDictionary.search("b.."); // return True


**Constraints:**

- <code>1 &lt;= word.length &lt;= 25</code>

- <code>word</code> in <code>addWord</code> consists of lowercase English letters.

- <code>word</code> in <code>search</code> consist of <code>'.'</code> or lowercase English letters.

- There will be at most <code>2</code> dots in <code>word</code> for <code>search</code> queries.

- At most <code>10<sup>4</sup></code> calls will be made to <code>addWord</code> and <code>search</code>.
