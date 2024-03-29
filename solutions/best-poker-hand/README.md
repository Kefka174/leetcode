# Best Poker Hand

You are given an integer array <code>ranks</code> and a character array <code>suits</code>. You have <code>5</code> cards where the <code>i<sup>th</sup></code> card has a rank of <code>ranks[i]</code> and a suit of <code>suits[i]</code>.

The following are the types of **poker hands** you can make from best to worst:

- <code>"Flush"</code>: Five cards of the same suit.

- <code>"Three of a Kind"</code>: Three cards of the same rank.

- <code>"Pair"</code>: Two cards of the same rank.

- <code>"High Card"</code>: Any single card.

Return *a string representing the **best** type of **poker hand** you can make with the given cards.*

**Note** that the return values are **case-sensitive**.


**Example 1:**
>
> **Input:** ranks = [13,2,3,1,9], suits = ["a","a","a","a","a"]
>
> **Output:** "Flush"
>
> **Explanation:** The hand with all the cards consists of 5 cards with the same suit, so we have a "Flush".

**Example 2:**
>
> **Input:** ranks = [4,4,2,4,4], suits = ["d","a","a","b","c"]
>
> **Output:** "Three of a Kind"
>
> **Explanation:** The hand with the first, second, and fourth card consists of 3 cards with the same rank, so we have a "Three of a Kind".
>
> Note that we could also make a "Pair" hand but "Three of a Kind" is a better hand.
>
> Also note that other cards could be used to make the "Three of a Kind" hand.

**Example 3:**
>
> **Input:** ranks = [10,10,2,12,9], suits = ["a","b","c","a","d"]
>
> **Output:** "Pair"
>
> **Explanation:** The hand with the first and second card consists of 2 cards with the same rank, so we have a "Pair".
>
> Note that we cannot make a "Flush" or a "Three of a Kind".


**Constraints:**

- <code>ranks.length == suits.length == 5</code>

- <code>1 &lt;= ranks[i] &lt;= 13</code>

- <code>'a' &lt;= suits[i] &lt;= 'd'</code>

- No two cards have the same rank and suit.
